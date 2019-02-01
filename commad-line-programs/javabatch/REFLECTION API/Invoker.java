import java.lang.reflect.*;

class Invoker
{
public static void main(String ar[])
{
try
{
Class c=Class.forName("One");
Class arr[]=new Class[1];
arr[0]=String.class;
Constructor ctr=c.getDeclaredConstructor(arr);
System.out.println("Constructor obtained...");
ctr.setAccessible(true);
System.out.println("Creating object of One...");
Object args[]=new Object[1];
args[0]=new String("Amit");
One x=(One)ctr.newInstance(args);
System.out.println("Invoking private method...");
Method m=c.getDeclaredMethod("display",null);
m.setAccessible(true);
m.invoke(x,null);
}catch(Exception e)
{
System.out.println(e);
}
}
}