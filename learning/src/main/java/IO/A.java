import java.io.*;

class A
{
public static void main(String ar[])
{
try
{
File f=new File(ar[0]);
BufferedInputStream b=new BufferedInputStream(System.in);
FileOutputStream out=new FileOutputStream(f);
int ch;
while(true)
{
ch=b.read();
if((char)ch=='n')
break;
out.write((byte)ch);
}
out.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}
