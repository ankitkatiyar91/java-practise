import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FirstApplet2 extends Applet implements ItemListener
{
Checkbox red,green,blue;
SecondApplet target;
public void init()
{
AppletContext ctx=getAppletContext();
target=(SecondApplet)ctx.getApplet("second");
setBackground(Color.gray);
CheckboxGroup g=new CheckboxGroup();
red=new Checkbox("Red",g,false);
green=new Checkbox("Green",g,false);
blue=new Checkbox("Blue",true,g);
add(red);add(green);add(blue);
red.addItemListener(this);
green.addItemListener(this);
blue.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
if(red.getState())
target.setBackground(Color.red);
else if(green.getState())
target.setBackground(Color.green);
else
target.setBackground(Color.blue);
target.repaint();
}

}

