package IO;
import java.io.*;

class ObjectReader 
{
public static void main(String ar[])
{
try
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.data"));
Employee1 e=(Employee1)in.readObject();
Employee1 f=(Employee1)in.readObject();
Employee1 g=(Employee1)in.readObject();
System.out.println("Following objects are desearilized...");
e.display();
f.display();
g.display();
}catch(Exception e){System.out.println(e);}
}
}
