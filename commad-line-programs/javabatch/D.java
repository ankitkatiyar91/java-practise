class A{
public String toString()
{
return "In A";
}
}
class B{
public String toString()
{
return "In B";
}
}
class C{
public String toString()
{
return "In C";
}

}

class D
{
public static void main(String ar[])
{
A a=new A();
B b=new B();
C c=new C();
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
