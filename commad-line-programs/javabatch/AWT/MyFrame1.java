import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame
{
public MyFrame1()
{
MyListener listener=new MyListener();
setTitle("It can be closed...");
setSize(300,300);
setVisible(true);
addWindowListener(listener);
}

public static void main(String ar[])
{
MyFrame1 f=new MyFrame1();
}
}

class MyListener extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}