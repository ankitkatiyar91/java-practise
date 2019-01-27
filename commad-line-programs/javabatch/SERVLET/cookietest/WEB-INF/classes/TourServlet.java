import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class TourServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
ServletConfig config=getServletConfig();
ServletContext ctx=config.getServletContext();
String name=(String)ctx.getAttribute("name");
out.println("Sorry  ,"+name);
out.println("<br> Site is under construction, visit again later..");
out.close();
}
}
