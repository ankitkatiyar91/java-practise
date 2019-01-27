import java.applet.*;
import java.awt.*;

public class FirstApplet1 extends Applet
{
String txt;
public void init()
{
setBackground(Color.blue);
setForeground(Color.white);
setFont(new Font("times new roman",Font.BOLD,20));
}
public void start()
{
txt=getParameter("msg");
}
public void paint(Graphics g)
{
g.drawString(txt,20,40);
}
}

