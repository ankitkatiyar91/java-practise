class Divide
{

public static int div(int x,int y)
{
try
{
return x/y;
}
catch(ArithmeticException e)
{
throw(e);
}
finally
{
System.out.println("Outside ctach");
}

}

public static void main(String ar[])
{
try
{
int a=Integer.parseInt(ar[0]);
int b=Integer.parseInt(ar[1]);
int c=div(a,b);
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}

}
}