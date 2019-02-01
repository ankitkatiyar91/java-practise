class A
{
static
{
System.out.println("Class A is loaded...");
}
public static void display()
{
System.out.println("It is class A...");
}
}

class B
{
public static void main(String ar[])
{
A.display();
}
static
{
System.out.println("Class B is loaded...");
}
}
