import java.io.*;

class Create
{
public static void main(String ar[])
{
try
{
BufferedInputStream f=new BufferedInputStream(System.in);
FileOutputStream out=new FileOutputStream(ar[0]);
int data;
System.out.println("Enter text, n to save the file...");
while(true)
{
data=f.read();
if(data=='n')
break;
out.write((byte)data);
}
out.close();
}catch(Exception e)
{}
}
}