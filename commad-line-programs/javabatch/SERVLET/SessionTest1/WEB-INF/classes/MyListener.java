import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class MyListener implements ServletContextListener,HttpSessionListener
{
ServletContext ctx;

public void contextInitialized(ServletContextEvent e)
{
ctx=e.getServletContext();
ctx.setAttribute("current",new Integer(0));
ctx.setAttribute("total",new Integer(0));
}

public void contextDestroyed(ServletContextEvent e)
{}

public void sessionCreated(HttpSessionEvent e)
{
Integer cur=(Integer)ctx.getAttribute("current");
int c=cur.intValue();
Integer tot=(Integer)ctx.getAttribute("total");
int t=tot.intValue();
c++;
t++;
ctx.setAttribute("current",new Integer(c));
ctx.setAttribute("total",new Integer(t));
}

public void sessionDestroyed(HttpSessionEvent e)
{
Integer cur=(Integer)ctx.getAttribute("current");
int c=cur.intValue();
c--;
ctx.setAttribute("current",new Integer(c));
}

}
