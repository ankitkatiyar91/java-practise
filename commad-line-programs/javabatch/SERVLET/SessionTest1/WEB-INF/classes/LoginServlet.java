import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
String name=request.getParameter("txtName");
HttpSession session=request.getSession();
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("Welcome  ,"+name);
out.println("<br> <a href=logoutServlet>Logout</a>");
out.close();
}
}
