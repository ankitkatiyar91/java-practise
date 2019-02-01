class Buffer
{
int a;
public synchronized void write(int x)
{
a=x;
System.out.println(a+" is written....");
}
public synchronized void read()
{
System.out.println(a+" is read....");
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