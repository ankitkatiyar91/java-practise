import java.io.*;

class Delete
{
public static void main(String ar[])
{
File f=new File(ar[0]);
if(!f.exists())
System.out.println("Does not exists...");
else
{
if(f.delete())
System.out.print("Directory successfully deleted.....");
else
System.out.println("Directory can not be deleted...");
}
}
}