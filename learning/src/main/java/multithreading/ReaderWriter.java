package multithreading;
class Buffer
{
int a;
boolean written=false;

public synchronized void write(int x)
{
if(written)
{
System.out.println("writer entered out of turn , suspending...");
try
{
wait();
}catch(Exception e){}
}
a=x;
System.out.println(a+" is written....");
notify();
written=true;
}

public synchronized void read()
{
if(!written)
{
System.out.println("reader entered monitor out of turn ,suspending it....");
try
{
wait();
}catch(Exception e){}
}
System.out.println(a+" is read....");
written=false;
notify();
}
}

class ReaderThread extends Thread
{
Buffer b;
public ReaderThread(Buffer b)
{
this.b=b;
}
public void run()
{
System.out.println("ReaderThread started....");
for(int i=1;i<=10;i++)
b.read();
}
}

class WriterThread extends Thread
{
Buffer b;
public WriterThread(Buffer b)
{
this.b=b;
}
public void run()
{
System.out.println("WriterThread started....");
for(int i=1;i<=10;i++)
b.write(i);
}
}

class ReaderWriter
{
public static void main(String ar[])
{
System.out.println("Creating Buffer and starting reader and Writer threads.....");
Buffer buf=new Buffer();
ReaderThread r=new ReaderThread(buf);
WriterThread w=new WriterThread(buf);

r.start();
w.start();
}
}