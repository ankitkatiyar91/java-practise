import java.sql.*;
import java.util.*;
import java.io.*;


class FunTest
{
public static void main(String ar[])
{
try
{
roperties p=new Properties();
p.load(new FileInputStream("data.properties"));
Class.forName(p.getProperty("driverclass"));
Connection con=DriverManager.getConnection(p.getProperty("connectionstring"),p.getProperty("user"),p.getProperty("password"));
CallableStatement stmt=con.prepareCall("{?=call getSalary(?)}");
stmt.setString(2,ar[0]);
stmt.registerOutParameter(1,Types.INTEGER);
stmt.execute();
System.out.println("Requested salary is: "+stmt.getInt(1));
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}