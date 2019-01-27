import java.rmi.*;
import java.rmi.server.*;

public class MyServer extends UnicastRemoteObject implements AdderSubstractor
{
public MyServer()throws RemoteException
{
super();
}
public int add(int x,int y)
{
System.out.println("add() is invoked...");
return x+y;
}
public int substract(int x,int y)
{
System.out.println("substract() is invoked...");
return x-y;
}
}
