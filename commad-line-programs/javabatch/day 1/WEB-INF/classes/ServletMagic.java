
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

 public class ServletMagic extends HttpServlet {

 //override which is inside the HttpServlet

String setting;

public void init(){

      ServletConfig sc=getServletConfig();
      setting=sc.getInitParameter("listing");    

}

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
               
        res.setContentType("text/html");
         //pw is poiting body of response
         PrintWriter pw =res.getWriter();
         //pw is reference for body of response
         if(setting.equals("true")){
         pw.println("<html><body bgcolor=blue text=white>");     
         }else{
         pw.println("<html><body bgcolor=black text=white>");     
         }
         pw.println("<h1>Your email is email</h1>");     
         pw.println("</body></html>");     

}
}