import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class TourServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
HttpSession session=request.getSession();
String name=(String)session.getAttribute("name");
session.invalidate();
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("Sorry  ,"+name);
out.println("<br> Site is under construction, visit again later..");
out.close();
}
}
