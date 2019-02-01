import java.util.*;
import java.io.*;

class RecordReader
{
public static void main(String ar[])
{
try
{
BufferedReader b=new BufferedReader(new FileReader("student.data"));
String str;
System.out.println("ID\tNAME\tCOURSE");
while(true)
{
str=b.readLine();
if(str==null)
break;
display(str);
}
}catch(Exception e){}
}
public static void display(String s) 
{
StringTokenizer st=new StringTokenizer(s,",");
System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken());
}
} 
