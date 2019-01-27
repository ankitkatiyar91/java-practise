class MyThread extends Thread
{

public MyThread(String name)
{
super(name);
start();
}

public void run()
{
String name=Thread.currentThread().getName();
System.out.println(name+" thread is started.....");
System.out.println(name+" thread is sleeping....");
try
{
Thread.sleep(10000);
System.out.println(name+" thread is resumed...");
System.out.println(name+" thread is exiting...");
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}

class Interrupter1
{
public static void main(String ar[])
{
System.out.println("starting lazy thread and giving it five seconds to complete....");
MyThread th=new MyThread("lazy");
MyThread th1=new MyThread("super lazy");
try
{
Thread.sleep(5000);
}catch(InterruptedException en)
{
System.out.println(en);
}

if(th.isAlive())
{
System.out.println("lazy threads are taking too long, interrupting them....");
th.interrupt();
}
}
}