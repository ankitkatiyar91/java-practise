import java.net.*;

class IPFinder
{
public static void main(String ar[])
{
try
{
InetAddress address=InetAddress.getByName(ar[0]);
System.out.println("IP address is "+address.getHostAddress());
}catch(Exception e)
{
System.out.println(e);
}
}
}