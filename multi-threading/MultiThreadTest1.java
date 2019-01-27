class MyThread1 implements Runnable
{
Thread t;
public MyThread1()
{
t=new Thread(this);
t.start();
}
public void run()
{
System.out.println("child thread is started.....");
for(int i=1;i<=10;i++)
{
System.out.println(i);
try
{
Thread.sleep(2000);
}catch(Exception e){}
}
System.out.println("child thread is terminating....");
}
}


class MultiThreadTest1
{
public static void main(String ar[])
{
System.out.println("main started, starting child thread.......");
MyThread1 th=new MyThread1();
for(int i=10;i>0;i--)
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
System.out.println("main thread is terminating...");
}
}