package IO;
import java.io.*;


class RecordSaver
{
public static void main(String ar[])
{
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(new FileOutputStream("student.data"));
System.out.println("Enter ID,Name ,& course seprated by comma, end to terminate...");
while(true)
{
String rec=b.readLine();
if(rec.equalsIgnoreCase("end"))
break;
out.println(rec);
}
out.close();
System.out.println("Records are saved successfully....");
}catch(Exception e){System.out.println(e);}
}
}