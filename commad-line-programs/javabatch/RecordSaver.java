import java.io.*;

class RecordSaver
{
public static void main(String ar[])
{
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter id,name,course seprated by , end to save the file");
PrintStream out=new PrintStream(new FileOutputStream("student.data"));
String str;
while(true)
{
str=b.readLine();
if(str.equals("end"))
break;
out.println(str);
}
out.close();
}catch(Exception e){}
}
}