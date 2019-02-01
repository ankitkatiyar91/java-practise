import java.applet.*;
import java.awt.*;

public class SecondApplet extends Applet
{
String txt;
public void init()
{
setBackground(Color.blue);
setForeground(Color.white);
setFont(new Font("times new roman",Font.BOLD,20));
}
public void paint(Graphics g)
{
g.drawString("Select Color from first Applet",20,40);
g.drawString(" to change background of this applet",20,70);
}
}

