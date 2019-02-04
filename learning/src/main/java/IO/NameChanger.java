package IO;
import java.io.*;

class NameChanger
{
public static void main(String ar[])
{
File f=new File(ar[0]);
if(!f.exists())
System.out.println("No such directory exists...");
else
{
if(f.renameTo(new File(ar[1])))
System.out.print("File/Directory successfully Renamed.....");
else
System.out.println("File/Directory can not be renamed...");
}
}
}