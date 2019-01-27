import java.util.*;
import java.io.*;

class MapTest1
{
public static void main(String ar[])
{
HashMap hs=new HashMap();
hs.put("Aman","Programmer");
hs.put("Aitya","Manager");
hs.put("Sacin","Team Leader");
hs.put("ravi","Trainner");
hs.put("Swarnim","Project manager");
hs.put("Sachin","Programmer");

System.out.println("There are "+hs.size()+" elements in the hash map...");
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("Enter name to find out job, end to terminate...");
String key=b.readLine();
if(key.equals("end"))
break;
System.out.println("job is :"+hs.get(key));
}
}catch(Exception e){}
}
}

