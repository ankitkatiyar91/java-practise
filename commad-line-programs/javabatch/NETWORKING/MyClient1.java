import java.net.*;
import java.io.*;

class MyClient1
{
public static void main(String ar[])
{
try
{
System.out.println("Sending connection request...");
Thread.sleep(5000);
Socket s=new Socket("localhost",2000);
Thread.sleep(1000);
System.out.println("Request granted,sending message to server..");
PrintWriter out=new PrintWriter(s.getOutputStream());
Thread.sleep(5000);
out.println("Hello server...");
out.flush();
System.out.println("Message sent waiting for ack...");
BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
String msg=b.readLine();
Thread.sleep(3000);
System.out.println("Server sent following ack: "+msg);
Thread.sleep(5000);
s.close();
System.out.println("Connection closed...");
}catch(Exception e){
System.out.println(e);
}
}
}