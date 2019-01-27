import java.io.*;
import java.net.*;

class Sender
{
public static void main(String ar[])
{
try
{
DatagramSocket sender=new DatagramSocket(3000);
System.out.println("Sender is ready...");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.print("Enter message ,end to terminate: ");
String str=b.readLine();
if(str.equals("end"))
break;
byte msg[]=new byte[100];
DatagramPacket packet=new DatagramPacket(str.getBytes(),str.length(),InetAddress.getLocalHost(),4000);
sender.send(packet);
System.out.println("Packet successfully sent...");
}
sender.close();
}catch(Exception e){System.out.println(e);}
}
}

