import java.net.*;
import java.io.*;

class MyServer
{
public static void main(String ar[])
{
try
{
ServerSocket server=new ServerSocket(2000);
System.out.println("server is ready, listening for connection request.....");
Socket t=server.accept();
System.out.println("Request received connection completed...");
Thread.sleep(5000);
System.out.println("Connection closed...");
server.close();
}catch(Exception e){System.out.println(e);}
}
} 