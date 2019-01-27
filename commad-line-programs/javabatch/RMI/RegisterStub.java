import java.rmi.*;


class RegisterStub
{
public static void main(String ar[])
{
try
{
System.out.println("Creating remote object...");
MyServer server=new MyServer();
System.out.println("objects created registering stub...");
Naming.bind("myserver",server);
System.out.println("stub is registered, server is ready...");
}catch(Exception e)
{
System.out.println(e);
}
}
}