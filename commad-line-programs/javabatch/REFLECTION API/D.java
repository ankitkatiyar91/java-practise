class D
{
public static void main(String ar[])
{
try
{
Class c=Class.forName(ar[0]);

System.out.println("indirectly creating object of class"+c.getName());
One a=(One)c.newInstance();
}catch(Exception e){System.out.println(e);}
}
}