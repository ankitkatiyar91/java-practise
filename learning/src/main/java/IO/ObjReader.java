package IO;
import java.io.*;

class ObjReader
{
public static void main(String ar[])
{
try
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.data"));
System.out.println("following objects are desirialized..");
Employee1 e=(Employee1)in.readObject();
Employee1 f=(Employee1)in.readObject();

e.display();
f.display();
}catch(Exception e){}
}
}