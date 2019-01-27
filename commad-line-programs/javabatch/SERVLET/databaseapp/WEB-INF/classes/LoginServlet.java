import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet
{

public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
doGet(request,response);
}

public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter writer=response.getWriter();
try
{
String id=request.getParameter("txtId");
String password=request.getParameter("txtPassword");
ServletConfig config=getServletConfig();
ServletContext ctx=config.getServletContext();
String driverclass=ctx.getInitParameter("driverclass");
String constr=ctx.getInitParameter("connectionstring");
Class.forName(driverclass);
Connection con=DriverManager.getConnection(constr);
PreparedStatement stmt=con.prepareStatement("select UserName from UserInfo where LoginId=? and Password=?");
stmt.setString(1,id);
stmt.setString(2,password);
ResultSet rset=stmt.executeQuery();
RequestDispatcher rd;
if(rset.next())
{
rd=request.getRequestDispatcher("welcomeServlet");
request.setAttribute("name",rset.getString(1));
rd.forward(request,response);
}
else
{
writer.println("<b>   Invalid loginId or Password </b><br>");
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
