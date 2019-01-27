import java.lang.reflect.*;
class MyJavap
{
public static void main(String ar[])
{
try
{
Class c=Class.forName(ar[0]);
Constructor ctr[]=c.getConstructors();
for(int i=0;i<ctr.length;i++)
System.out.println(ctr[i]);
Field f[]=c.getFields();
for(int i=0;i<f.length;i++)
System.out.println(f[i]);
Method m[]=c.getDeclaredMethods();
for(int i=0;i<m.length;i++)
System.out.println(m[i]);
}catch(Exception e)
{
e.printStackTrace();
}
}
}
