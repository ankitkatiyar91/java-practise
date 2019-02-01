import java.io.*;

class Copier
{
public static void main(String ar[])
{
try
{
SequenceInputStream in=new SequenceInputStream(new FileInputStream(ar[0]),new FileInputStream(ar[1]));
FileOutputStream out=new FileOutputStream(ar[2]);
int ch;
while(true)
{
ch=in.read();
if(ch==-1)
break;
out.write((byte)ch);
}
out.close();
}catch(Exception e){}
}
}
                                                                 