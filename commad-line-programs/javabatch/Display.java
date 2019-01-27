import java.io.*;

class Display
{
public static void main(String ar[])
{
try
{
FileInputStream f=new FileInputStream(ar[0]);
byte b[]=new byte[f.available()];
System.out.println(f.available());
System.out.println(f.read(b));
System.out.print(new String(b));
}catch(Exception e)
{}
}
}