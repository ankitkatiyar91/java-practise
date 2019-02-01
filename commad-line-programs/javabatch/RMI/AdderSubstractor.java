import java.rmi.*;

public interface AdderSubstractor extends Remote
{
public int add(int x,int y)throws RemoteException;
public int substract(int x,int y)throws RemoteException;
}
