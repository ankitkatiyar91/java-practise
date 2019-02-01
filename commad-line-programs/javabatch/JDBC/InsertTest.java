import java.sql.*;
import java.util.*;
import java.io.*;

class InsertTest
{
public static void main(String ar[])
{
try
{

Class.forName(p.getProperty("sun.jdbc.odbc.JdbcOdbcDriver"));
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?,?)");
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("Enter Id");
String id=b.readLine();
System.out.println("Enter Name");
String n=b.readLine();
System.out.println("Enter job");
String j=b.readLine();
System.out.println("Enter Salary");
int s=Integer.parseInt(b.readLine());
stmt.setString(1,id);
stmt.setString(2,n);
stmt.setString(3,j);
stmt.setInt(4,s);
stmt.executeUpdate();
System.out.println("Want to insert more records, yes/no ?");
String ans=b.readLine();
if(ans.equals("no"))
break;
}
con.close();
System.out.println("Records are successfully inserted");

}catch(Exception e)
{
System.out.println(e);
}
}
}