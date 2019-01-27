import java.io.*;

class ObjSaver
{
public static void main(String ar[])
{
try
{
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.data"));
Emp e=new Emp("amit","manager",45000);
Emp f=new Emp("rajat","team leader",87000);
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