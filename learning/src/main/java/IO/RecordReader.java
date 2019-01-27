import java.io.*;
import java.util.*;

class RecordReader
{
public static void main(String ar[])
{
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(new FileInputStream("student.data")));
System.out.println("Following records are read..");
while(true)
{
String rec=b.readLine();
if(rec==null)
break;
display(rec);
}
}catch(Exception e){System.out.println(e);}
}
public static void display(String record)
{
StringTokenizer str=new StringTokenizer(record,",");
System.out.println(str.nextToken()+"\t"+str.nextToken()+"\t"+str.nextToken());
}
}