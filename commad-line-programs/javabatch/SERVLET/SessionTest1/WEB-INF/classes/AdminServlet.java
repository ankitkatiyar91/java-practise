import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class AdminServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("Welcome  ,Administrator");
ServletConfig config=getServletConfig();
ServletContext ctx=config.getServletContext();
int t=((Integer)ctx.getAttribute("total")).intValue();
int c=((Integer)ctx.getAttribute("current")).intValue();
out.println("<br> Current user count: "+c);
out.println("<br> Total user count: "+t);
out.println("<br> <a href=adminServlet>refreshCounters</a>");
out.close();
}
}
