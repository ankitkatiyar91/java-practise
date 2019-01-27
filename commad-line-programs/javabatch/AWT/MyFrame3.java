import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame
{
TextField txt;
public MyFrame3()
{
Label lbl=new Label("STATUS");
txt=new TextField(20);
setLayout(new FlowLayout());
add(lbl);add(txt);

//Anonymous inner class started
WindowAdapter listener=new WindowAdapter(){
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
};
//End of anonymous inner class

setTitle("It can be closed...");
setSize(300,300);
setVisible(true);
addWindowListener(listener);
}

public static void main(String ar[])
{
MyFrame3 f=new MyFrame3();
}
}

