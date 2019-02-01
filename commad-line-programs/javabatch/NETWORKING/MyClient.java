import java.net.*;
import java.io.*;

class MyClient
{
public static void main(String ar[])
{
try
{
System.out.println("Sending connection request...");
Thread.sleep(5000);
Socket s=new Socket("B",2000);
Thread.sleep(1000);
System.out.println("Request granted,sending messageto server..");
Thread.sleep(5000);
s.close();
System.out.println("Connection closed...");
}catch(Exception e){System.out.println(e);}
}
}