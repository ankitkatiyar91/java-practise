import java.sql.*;

class SelectTest
{
public static void main(String ar[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
Statement stmt=con.createStatement();
ResultSet rset=stmt.executeQuery("select * from emp1");
//System.out.println(rset);
System.out.println("Following records are selected.....");
while(rset.next())
{
System.out.println(rset.getInt(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getInt(4));
}
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}