import java.io.*;

class ObjReader
{
public static void main(String ar[])
{
try
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.data"));
System.out.println("following objects are desirialized..");
Emp e=(Emp)in.readObject();
Emp f=(Emp)in.readObject();

e.display();
f.display();
}catch(Exception e){}
}
}