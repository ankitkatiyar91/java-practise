class Rectangle
{
private int l,b;

public int area()
{
return l*b;
}
public Rectangle(){}
public Rectangle(int x,int y)
{
l=x;
b=y;
}
public void show()
{
System.out.println(l);
System.out.println(b);
}                                                             
}

class RectangleTest
{
public static void main(String ar[])
{
Rectangle r=new Rectangle(5,10);
Rectangle ob=new Rectangle(10,20);
Rectangle ob1=new Rectangle();
System.out.println("Area==="+r.area());
System.out.println("Area==="+ob.area());
r.show();
ob.show();
ob1.show();
}
}
 
