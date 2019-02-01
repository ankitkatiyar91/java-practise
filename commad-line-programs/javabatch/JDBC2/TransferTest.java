import java.sql.*;
import java.io.*;
import java.util.*;

class TransferTest
{
public static void main(String ar[])
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("data.properties"));
Class.forName(p.getProperty("driverclass"));
Connection con=DriverManager.getConnection(p.getProperty("connectionstring"),p.getProperty("user"),p.getProperty("password"));
PreparedStatement stmt1=con.prepareStatement("update account set balance=balance+? where acno=?");
PreparedStatement stmt2=con.prepareStatement("update account set balance=balance-? where acno=?");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter source A/C no...");
int src=Integer.parseInt(b.readLine());
System.out.println("Enter Destination A/C no...");
int target=Integer.parseInt(b.readLine());
System.out.println("Enter Amount to be transfered...");
int amt=Integer.parseInt(b.readLine());
stmt1.setInt(1,amt);
stmt1.setInt(2,target);
stmt1.executeUpdate();
stmt2.setInt(1,amt);
stmt2.setInt(2,src);
stmt2.executeUpdate();
con.close();
System.out.println("Transaction is successfull...");

}catch(Exception e)
{
System.out.println(e);
}
}
}
