package IO;
import java.io.*;

class MyDir
{
public static void main(String ar[])
{
File f;
if(ar.length==0)
f=new File(".");
else
f=new File(ar[0]);
if(f.isFile())
System.out.println("Not a directory...");
else
{
String contents[]=f.list();
for(int i=0;i<contents.length;i++)
{
File tmp=new File(f,contents[i]);
if(tmp.isDirectory())
System.out.print("<Dir>\t");
else
System.out.print("<File>\t");
System.out.println(contents[i]);
}
}
}
}