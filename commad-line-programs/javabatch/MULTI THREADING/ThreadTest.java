class ThreadTest
{
public static void main(String ar[])
{
System.out.println("Obtaining reference of its Thread object.......");
Thread t=Thread.currentThread();
System.out.println("It is "+t.getName()+" & its priority is "+t.getPriority());
System.out.println("Changing name and priority..");
t.setName("my thread");
t.setPriority(8);
System.out.println("Suspending it for 5 seconds....");
try
{
Thread.sleep(5000);
}catch(Exception e)
{
System.out.println(e);
}
System.out.println(t.getName()+" Thread is resumed its priority was "+t.getPriority());
System.out.println("Thread is terminating......");
}
}
