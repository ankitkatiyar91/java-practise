import java.io.*;

class OnlyExt implements FilenameFilter
{
String ext;
public OnlyExt(String ext)
{
this.ext=ext;
}
public boolean accept(File dir,String name)
{
return name.endsWith(ext);
}
}

class FilterTest
{
public static void main(String ar[])
{
File f=new File(ar[0]);
FilenameFilter only=new OnlyExt("html");
String s[]=f.list(only);

for(int i=0;i<s.length;i++)
System.out.println(s[i]);
}
}