import java.io.*;
import java.net.*;

class Receiver
{
public static void main(String ar[])
{
try
{
DatagramSocket receiver=new DatagramSocket(4000);
System.out.println("Receiver is ready press ctrl+c to close...");
while(true)
{
System.out.println("Waiting for message...");
byte msg[]=new byte[100];
DatagramPacket packet=new DatagramPacket(msg,100);
receiver.receive(packet);
String str=new String(packet.getData());
System.out.println("Following packet received:  "+str.trim());
}
}catch(Exception e){System.out.println(e);}
}
} 