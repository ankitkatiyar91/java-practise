import java.sql.*;
import java.util.*;
import java.io.*;

class SelectTest1
{
public static void main(String ar[])
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","scott","tiger");
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