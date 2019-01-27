import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExcelServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("application/vnd.ms-excel");
PrintWriter out=response.getWriter();
out.println("Name\tjob\tsalary");
out.println("Raj\tclerck\t12000");
out.println("Aditya\tprogrammer\t22000");
out.println("Rajeev\tmanager\t42000");
}
}
