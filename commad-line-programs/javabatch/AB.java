class AB
{
int a,b;
public AB()
{
this(5);
System.out.println("Default...");
}
public AB(int x)
{
System.out.println("One argumented...");
this(x,10);

}
public AB(int x,int y)
{
a=x;
b=y;
System.out.println("Two argumented...");
}

public void display()
{
System.out.println("a==="+a);
System.out.println("b==="+b);
}
public static void main(String ar[])
{
new AB().display();
new AB(2).display();
new AB(8,12).display();
}
}

