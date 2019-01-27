import java.util.*;
import java.io.*;
import java.sql.*;

class Selector
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
String qr="select * from "+ar[0];
ResultSet rset=stmt.executeQuery(qr);
ResultSetMetaData rmd=rset.getMetaData();
int c=rmd.getColumnCount();
System.out.println("Following Records are fetched...");
for(int i=1;i<=c;i++)
{
System.out.println(rmd.getColumnName(i)+"\t");
}
while(rset.next())
{
System.out.println();
for(int i=1;i<=c;i++)
System.out.print(rset.getString(i)+"\t");

}
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}