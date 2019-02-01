class MyInteger
{
int value;
public MyInteger(int y)
{
value=y;
}
public void setValue(int x)
{
value=x;
}
public int getValue()
{
return value;
}
}

class Swapper
{
public static void swap(MyInteger x,MyInteger y)
{
int z=x.getValue();
x.setValue(y.getValue());
y.setValue(z);
}

public static void main(String ar[])
{
MyInteger a=new MyInteger(5);
MyInteger b=new MyInteger(6);
System.out.println("a & b before swaping==="+a.value+" "+b.value);
swap(a,b);
System.out.println("a & b after swaping==="+a.value+" "+b.value);
}

}

