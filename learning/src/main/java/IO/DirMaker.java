import java.io.*;

class DirMaker
{
public static void main(String ar[])
{
File f=new File(ar[0]);
if(f.exists())
System.out.println("Already exists...");
else
{
if(f.mkdir())
System.out.print("Directory successfully created.....");
else
System.out.println("Directory can not be created...");
}
}
}