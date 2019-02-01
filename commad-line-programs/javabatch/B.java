class A
{
public static void show()
{
System.out.println("dfhFdjg");
}
}

class B extends A
{
public static void main(String ar[])
{
show();
A a=new A();
a.show();
A b=new B();
b.show();
B c=new B();
c.show();
}

}