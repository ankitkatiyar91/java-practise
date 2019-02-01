import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet
{
public void init()
{
setBackground(Color.blue);
setForeground(Color.white);
setFont(new Font("Times new Roman",Font.BOLD,20));
}
public void paint(Graphics g)
{
g.drawString("It is an applet ",20,40);
}
}