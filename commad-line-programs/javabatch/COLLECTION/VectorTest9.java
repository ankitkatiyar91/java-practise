import java.util.*;

class VectorTest9
{
static Enumeration e;

public static void main(String ar[])
{
Vector v=new Vector();
v.addElement("Raj");
v.add("Sachin");
v.add(1,"Kapil");
v.addElement("Amit");

System.out.println("There are "+v.size()+" elements in the Vector...");

e=v.elements();
Thread t=new Thread()
{
public void run()
{
System.out.println("new Thread started...\n");
System.out.println("Contents of vector...");
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
try
{
Thread.sleep(1000);
}catch(Exception ee){}
}
}
};

System.out.println("Stsrting a new thread to travesre elements of state");
t.start();
try
{
Thread.sleep(1000);
}
catch(Exception er){}
System.out.println("Removing Amit and adding Raman to Vector...");
v.remove("Amit");
v.add("Raman");
}

}
