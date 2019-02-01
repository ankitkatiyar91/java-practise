import java.rmi.*;


class MyClient
{
public static void main(String ar[])
{
try
{
System.out.println("Obtaining remote stub...");
AdderSubstractor stub=(AdderSubstractor)Naming.lookup("myserver");
System.out.println("stub obtained, invoking remote methods...");
int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);
int c=stub.add(a,b);
int d=stub.substract(a,b);
System.out.println("Sum is: "+c);
System.out.println("Substraction is: "+d);
}catch(Exception e)
{
System.out.println(e);
}
}
}

