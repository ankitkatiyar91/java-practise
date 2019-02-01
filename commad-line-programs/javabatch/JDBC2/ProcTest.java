import java.sql.*;
import java.util.*;
import java.io.*;


class ProcTest
{
public static void main(String ar[])
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("data.properties"));
Class.forName(p.getProperty("driverclass"));
Connection con=DriverManager.getConnection(p.getProperty("connectionstring"),p.getProperty("user"),p.getProperty("password"));
CallableStatement stmt=con.prepareCall("{call getName(?,?)}");
stmt.setString(1,ar[0]);
stmt.registerOutParameter(2,Types.VARCHAR);
stmt.execute();
System.out.println("Requested name is: "+stmt.getString(2));
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}