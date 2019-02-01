import java.io.*;

class MyReader
{
BufferedReader b;
public MyReader()
{
b=new BufferedReader(new InputStreamReader(System.in));
}
public synchronized String readData(String msg)
{
try
{
System.out.println(msg);
return b.readLine();
}catch(Exception e)
{
return "Error in I/O.";
}
}
}

class NameReader extends Thread
{
MyReader reader;
public NameReader(MyReader r)
{
reader=r;
}
public void run()
{
synchronized(reader)
{
System.out.println("NameReader started....");
String name=reader.readData("Enter your name:");
System.out.println("name is: "+name);

System.out.println("Name reader is exiting.....");
}
}
}

class MailReader extends Thread
{
MyReader reader;
public MailReader(MyReader r)
{
reader=r;
}
public void run()
{
synchronized(reader)
{
System.out.println("MailReader started....");
String mail=reader.readData("enter your mainl id: ");
System.out.println("mail Id: "+mail);

System.out.println("Mail Reader is exiting...");
}
}
}

class InputTest1
{
public static void main(String ar[])
{
MyReader reader=new MyReader();
NameReader n=new NameReader(reader);
MailReader m=new MailReader(reader);

System.out.println("starting namereader & mailreader...");
n.start();
m.start();
}
}