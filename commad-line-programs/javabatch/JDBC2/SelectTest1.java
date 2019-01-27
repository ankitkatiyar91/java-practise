import java.sql.*;
import java.util.*;
import java.io.*;

class SelectTest1
{
public static void main(String ar[])
{
try
{
Properties p=new Properties();
p.load(new FileInputStream("data.properties"));
Class.forName(p.getProperty("driverclass"));
Connection con=DriverManager.getConnection(p.getProperty("connectionstring"),p.getProperty("user"),p.getProperty("password"));
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from emp1");
System.out.println("Following records are selected.....");
while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getInt(4));
}
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}