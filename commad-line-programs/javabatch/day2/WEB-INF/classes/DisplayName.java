
   package com.jp;
    import java.io.*;
    import javax.servlet.*;
    import javax.servlet.http.*;

 public class DisplayName extends HttpServlet {



public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
               
        String name=req.getParameter("name");
        StringBuilder sb=new StringBuilder(""); 
        sb.append("Hello! "+name);
        res.setContentType("text/html");
         //pw is poiting body of response
         PrintWriter pw =res.getWriter();
         //pw is reference for body of response
          pw.println("<html><body bgcolor=blue text=white>");     
         pw.println("<h1>"+sb.toString()+"</h1>");     
         pw.println("</body></html>");     

}
}