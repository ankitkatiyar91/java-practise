import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener
{
public MyFrame()
{

setTitle("It can be closed...");
setSize(300,300);
setVisible(true);
MyFrame listener=new MyFrame();
addWindowListener(listener);
}
public void windowOpened(WindowEvent e){} 
public void windowClosed(WindowEvent e){}
public void windowClosing(WindowEvent e){System.exit(0);}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}

public static void main(String ar[])
{
MyFrame f=new MyFrame();
}
}