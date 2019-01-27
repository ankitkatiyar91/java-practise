import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class LogoutServlet extends HttpServlet
{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
HttpSession session=request.getSession();
session.invalidate();
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("You are successfully logged out?????");
out.println("<br><form action=\"tourServlet\">");
out.println("<br> <a href=Home.html>Login Again</a>");
out.close();
}
}
