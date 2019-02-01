class AB
{
int a,b;
public AB(int a,int b)
{
this.a=a;
this.b=b;
}
public void show()
{
System.out.println("a==="+a);
System.out.println("b==="+b);
}
}

class Test
{
public static void main(String ar[])
{
AB ob=new AB(5,6);
ob.show();
AB ob1=new AB(10,20);
ob1.show();
}
}
