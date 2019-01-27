import java.util.*;

class VectorTest
{
public static void main(String ar[])
{
Vector v=new Vector();
v.addElement("Raj");
v.add("Sachin");
v.add(1,"Kapil");
v.addElement("Amit");

System.out.println("There are "+v.size()+" elements in the Vector...");
System.out.println("Contents of Vector...");
Enumeration e=v.elements();
while(e.hasMoreElements())
System.out.println(e.nextElement());
}
}