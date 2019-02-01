import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet
{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter writer=response.getWriter();
String name=(String)request.getAttribute("name");
writer.println("<b> Welcome </b> "+name);
writer.close();
}
}
