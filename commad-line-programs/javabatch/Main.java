class A
{
int a;
public A(int x)
{
a=x;
}
}

class B extends A
{
int a;
public B(int x,int y)
{
super(x);
a=y;
}
public void show()
{
System.out.println(super.a);
}
}

class C extends B
{
int a;
public C(int x,int y,int z)
{
super(x,y);
a=z;
}
public void show()
{
System.out.println(a);
System.out.println(super.a);
super.show();
}
}

class Main
{
public static void main(String ar[])
{
C c=new C(10,20,30);
c.show();
}
}
