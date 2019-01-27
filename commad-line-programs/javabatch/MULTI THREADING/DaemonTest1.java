class ThreadOne extends Thread
{
public void run()
{
System.out.println("child thread started.....");
for(int i=1;i<=10;i++)
{
System.out.println(i);
try
{
Thread.sleep(2000);
}catch(Exception e)
{
System.out.println(e);
}
}
System.out.println("child thread is terminating...");
}

}


class DaemonTest1
{
public static void main(String ar[])
{
System.out.println("starting child thread as Daemon thread..");
ThreadOne t=new ThreadOne();
t.setDaemon(true);
t.start();
try
{
System.out.println("suspending main()..");
Thread.sleep(2000);
}catch(Exception e){}
System.out.println("Exiting main...");
}
}