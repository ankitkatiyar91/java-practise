import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame
{
TextField txt;
public MyFrame4()
{
Label lbl=new Label("STATUS");
txt=new TextField(20);
setLayout(new FlowLayout());
add(lbl);add(txt);

//Anonymous inner class started
WindowListener listener=new WindowListener(){

public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public void windowActivated(WindowEvent e){
txt.setText("Activated.");
}
public void windowDeactivated(WindowEvent e){
txt.setText("Deactivated.");
}
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
};
//End of anonymous inner class

setTitle("It can be closed...");
setSize(300,300);
setVisible(true);
addWindowListener(listener);
}

public static void main(String ar[])
{
new MyFrame4();
new MyFrame4();
new MyFrame4();
new MyFrame4();
new MyFrame4();
}
}

