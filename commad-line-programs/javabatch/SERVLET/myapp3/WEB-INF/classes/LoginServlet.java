import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter writer=response.getWriter();
try
{
String id=request.getParameter("txtId");
String password=request.getParameter("txtPassword");
Class.forName("Sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:userinfo");
PreparedStatement stmt=con.prepareStatement("Select username from userinfo where id=? and password=?");
stmt.setString(1,id);
stmt.setString(2,password);
ResultSet rset=stmt.getResultSet();
RequestDispatcher rd;
if(rset.next())
{
rd=request.getRequestDispatcher("welcomeServlet");
request.setAttribute("name",rset.getString(1));
rd.forward(request,response);
}
else
{
writer.println("<b> invalid loginid or password </b></br>");
rd=request.getRequestDispatcher("index.html");
rd.include(request,response);
}
con.close();
writer.close();
}catch(Exception ec)
{
System.out.println(ec);
}
}
}