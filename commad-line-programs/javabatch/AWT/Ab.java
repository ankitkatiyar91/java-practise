import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
TextField txt;
public MyFrame()
{
Label lbl=new Label("Status");
txt=new TextField(20);
setLayout(new FlowLayout());
add(lbl);add(txt);
setSize(200,200);
setVisible(true);
//inner class
/*WindowAdapter listener=new WindowAdapter()
{
public void windowActivated(WindowEvent e)
{
txt.setText("Activated");
}
public void windowDeactivated(WindowEvent e)
{
txt.setText("Deactivated");
}               
};*/

WindowListener listener=new WindowListener()
{
public void windowDeactivated(WindowEvent e)
{
txt.setText("Deactivated");
}
public void windowActivated(WindowEvent e)
{
txt.setText("Activated");
}
public void windowClosed(WindowEvent e)
{}
public void windowOpened(WindowEvent e)
{}
public void windowClosing(WindowEvent e)
{System.exit(0);}
public void windowIconified(WindowEvent e)
{}
public void windowDeiconified(WindowEvent e)
{}
};
addWindowListener(listener);
}
public static void main(String ar[])
{
new MyFrame();
}
}


         