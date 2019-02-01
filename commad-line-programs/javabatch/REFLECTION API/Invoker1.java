import java.lang.reflect.*;

class Invoker1
{
public static void main(String ar[])
{
try
{
Class c=Class.forName("One1");

Constructor ctr=c.getDeclaredConstructor(null);
System.out.println("Constructor obtained...");
ctr.setAccessible(true);
System.out.println("Creating object of One...");

One1 x=(One1)ctr.newInstance(null);
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