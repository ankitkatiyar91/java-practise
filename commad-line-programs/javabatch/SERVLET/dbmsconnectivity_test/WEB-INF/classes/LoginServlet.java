import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter writer=response.getWriter();

try
{
String id=request.getParameter("txtId");
String password=request.getParameter("txtPassword");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
PreparedStatement stmt=con.prepareStatement("select userName from empInfo where loginId=? and password=?");
stmt.setString(1,id);
stmt.setString(3,password);
ResultSet rset=stmt.executeQuery();
RequestDispatcher rd;
if(rset.next())
{
rd=request.getRequestDispatcher("welcomeServlet");
request.setAttribute
}
}
