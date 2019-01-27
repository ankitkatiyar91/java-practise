import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WordServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("application/ms-word");
PrintWriter out=response.getWriter();
out.println("this document will  be opened using ms word");
}
}
