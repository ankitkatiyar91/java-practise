import java.io.*;

class Emp implements Serializable
{
String name,job;
int salary;
public Emp(String n,String j,int s)
{
name=n;
job=j;
salary=s;
}
public void display()
{
System.out.println(name+"\t"+job+"\t"+salary);
}
}

class ObjectSaver
{
public static void main(String ar[])
{
try
{
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.data"));
Emp e=new Emp("Amit","Developer",20000);
Emp f=new Emp("Arun","Designer",23000);
Emp g=new Emp("Devesh","Programmer",26000);
System.out.println("Following objects are serialized...");
e.display();
f.display();
g.display();
out.writeObject(e);
out.writeObject(f);
out.writeObject(g);
}catch(Exception e){System.out.println(e);}
}
}