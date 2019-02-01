import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame
{
public MyFrame2()
{
Label lbl=new Label("STATUS");
TextField txt=new TextField(20);
setLayout(new FlowLayout());
add(lbl);add(txt);
MyListener listener=new MyListener(txt);
setTitle("It can be closed...");
setSize(300,300);
setVisible(true);
addWindowListener(listener);
}

public static void main(String ar[])
{
MyFrame2 f=new MyFrame2();
}
}

class MyListener extends WindowAdapter
{
TextField txt;
public MyListener(TextField txt)
{
this.txt=txt;
}
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
}