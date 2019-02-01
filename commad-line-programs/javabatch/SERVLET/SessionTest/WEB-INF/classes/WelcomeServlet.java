import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class WelcomeServlet extends HttpServlet
{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
String name=request.getParameter("txtName");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
HttpSession session=request.getSession();
session.setAttribute("name",name);
out.println("Welcome  "+name);
out.println("<br><form action=\"tourServlet\">");
out.println("<input type=\"submit\" value=\"Take a Tour\"></form>");
out.close();
}
}
