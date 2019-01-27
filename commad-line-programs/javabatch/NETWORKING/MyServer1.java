import java.net.*;
import java.io.*;

class MyServer1
{
public static void main(String ar[])
{
try
{
ServerSocket server=new ServerSocket(2000);
System.out.println("server is ready, listening for connection request.....");
Socket t=server.accept();
System.out.println("Request received connection completed...");
BufferedReader b=new BufferedReader(new InputStreamReader(t.getInputStream()));
String msg=b.readLine();
Thread.sleep(3000);
System.out.println("client sent following message: "+msg);
System.out.println("Sending ack....");
PrintWriter out=new PrintWriter(t.getOutputStream());
Thread.sleep(5000);
out.println("Hi,client your message is received..");
out.flush();
System.out.println("Ack sent...");
Thread.sleep(5000);
System.out.println("Connection closed...");
server.close();
}catch(Exception e){System.out.println(e);}
}
} 