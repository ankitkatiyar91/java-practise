import java.sql.*;
import java.io.*;

class SelectTest
{
public static void main(String ar[])
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from emp");
System.out.println("Following records are selected.....");
while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getInt(4));
}


BufferedReader b=new BufferedReader(new InputStreamReader(System.in));

PrintWriter out=new PrintWriter(new FileOutputStream(ar[1]));
String str;
while(true)
{
str=b.readLine();
if(str==null)
break;
out.println(str);
}
out.close();
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}