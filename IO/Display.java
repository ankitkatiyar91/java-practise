import java.io.*;

class Display
{
public static void main(String ar[])
{
try
{
File f=new File(ar[0]);
BufferedReader b=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
String s;
while(true)
{
s=b.readLine();
if(s==null)
break;
System.out.println(s);
}
}catch(Exception e)
{
System.out.println(e);
}
}
}