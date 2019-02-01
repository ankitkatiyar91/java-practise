import java.io.*;

class ObjectReader 
{
public static void main(String ar[])
{
try
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.data"));
Emp e=(Emp)in.readObject();
Emp f=(Emp)in.readObject();
Emp g=(Emp)in.readObject();
System.out.println("Following objects are desearilized...");
e.display();
f.display();
g.display();
}catch(Exception e){System.out.println(e);}
}
}
