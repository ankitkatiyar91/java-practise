import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
String name=request.getParameter("txtName");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("Welcome "+name);
}
}
