package beanpack;

import java.sql.*;

public class UserBean
{
private String name,password,mailid;

public String getName()
{
return name;
}
public void setName(String n)
{
name=n;
}
public String getPassword()
{
return password;
}
public void setPassword(String p)
{
password=p;
}
public String getMail()
{
return mailid;
}
public void setMail(String m)
{
mailid=m;
}

public Connection getConnection()
{
Connection con=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:user");
}catch(Exception e)
{
System.out.println(e);
}
return con;
}

public void register()throws Exception
{
try
{
Connection con=getConnection();
PreparedStatement stmt=con.prepareStatement("insert into loginInfo values(?,?,?)");
stmt.setString(1,name);
stmt.setString(2,password);
stmt.setString(3,mailid);
stmt.executeUpdate();
con.close();
}catch(Exception e)
{
throw (e);
}
}

}