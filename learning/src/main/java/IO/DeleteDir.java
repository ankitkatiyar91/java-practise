package IO;

import java.io.*;

class DeleteDir
{
public static void main(String ar[])
{
File f=new File(ar[0]);
if(!f.exists())
System.out.println("No such directory exists...");
else if(f.delete())
System.out.println("Deleted");
else
deletedir(f);
}
public static void deletedir(File f)
{
String s[]=f.list();
for(int i=0;i<s.length;i++)
{
File tmp=new File(f,s[i]);
if(tmp.delete());
//System.out.println("Deleted");
else
deletedir(tmp);
}
f.delete();
}
}