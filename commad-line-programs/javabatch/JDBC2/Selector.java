import java.sql.*;
import java.util.*;
import java.io.*;

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
ResultSet rs=stmt.executeQuery(qr);
ResultSetMetaData rmd=rs.getMetaData();
int c=rmd.getColumnCount();
System.out.println("Following records are fetched...");
for(int i=1;i<=c;i++)
{
System.out.print(rmd.getColumnName(i)+"\t");
}
while(rs.next())
{
System.out.println();
for(int i=1;i<=c;i++)
System.out.print(rs.getString(i)+"\t");
}
con.close();
}
catch(Exception e){}
}
}
