import java.io.*;

class Copy
{
public static void main(String ar[])
{
try
{
BufferedReader b=new BufferedReader(new FileReader(ar[0]));
BufferedReader b1=new BufferedReader(new FileReader(ar[1]));
PrintStream out=new PrintStream(new FileOutputStream(ar[2]));
String st;
while(true)
{
st=b.readLine();
if(st==null)
break;
out.println(st);
}
while(true)
{
st=b1.readLine();
if(st==null)
break;
out.println(st);
}
out.close();
}catch(Exception e){System.out.println(e);}
}
}


