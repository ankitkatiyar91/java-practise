package IO;
import java.io.*;

class ObjSaver
{
public static void main(String ar[])
{
try
{
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.data"));
Employee1 e=new Employee1("amit","manager",45000);
Employee1 f=new Employee1("rajat","team leader",87000);
System.out.println("Serializing following objects..");
e.display();
f.display();
out.writeObject(e);
out.writeObject(f);
out.close();
System.out.println("Objects are succefully saved into emp.data..");
}catch(Exception e){}
}
}