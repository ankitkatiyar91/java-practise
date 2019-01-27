package p1;

import p2.Two;
import p3.*;

class One
{
public static void main(String ar[])
{
System.out.println("It is part of package p1");
Two ob=new Two();
ob.show();
p3.Two ob1=new p3.Two();
ob1.show();                      
}
}
 