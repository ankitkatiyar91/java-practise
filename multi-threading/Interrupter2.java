class MyThread extends Thread
{

public MyThread(ThreadGroup g,String name)
{
super(g,name);
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

class Interrupter2
{
public static void main(String ar[])
{
System.out.println("starting lazy thread and giving it five seconds to complete....");
ThreadGroup g=new ThreadGroup("my group");

MyThread th=new MyThread(g,"lazy");
MyThread th1=new MyThread(g,"super lazy");
try
{
Thread.sleep(5000);
}catch(InterruptedException en)
{
System.out.println(en);
}

if(g.activeCount()>0)
{
System.out.println("lazy threads are taking too long, interrupting them....");
g.interrupt();
}
}
}