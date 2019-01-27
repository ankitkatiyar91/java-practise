
import java.net.*;
import java.io.*;

public class ThreadedEchoServer
{
public static void main(String ar[])
{
try
{
int i=1;
ServerSocket s=new ServerSocket(localhost,8189);
for(;;)
{
Socket incoming=s.accept();
System.out.println("Client # "+i);
Thread t=new ThreadedEchoHandler(incoming,i);
t.start();
i++;
}
}catch(Exception e)
{
e.printStackTrace();
}
}
}

class ThreadedEchoHandler extends Thread
{
private Socket incoming;
private int counter;
public ThreadedEchoHandler(Socket i,int c)
{
incoming=i;
counter=c;
}
public void run()
{
try
{
BufferedReader in=new BufferedReader(new InputStreamReader(incoming.getInputStream()));
PrintWriter out=new PrintWriter(incoming.getOutputStream(),true);
out.println("Hello! Enter BYE to exit.");
boolean done=false;
while(!done)
{
String str=in.readLine();
if(str==null)
done=true;
else
{
out.println("Echo ( "+counter+"): "+str);
if(str.trim().equals("BYE"))
done=true;
}
}
incoming.close();
}catch(Exception e)
{
e.printStackTrace();
}
}
}