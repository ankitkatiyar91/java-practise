import java.awt.*;
import java.awt.event.*;

class SumApp1 implements ActionListener
{
public static void main(String ar[])
{
Frame t=new Frame();
SumApp1 s=new SumApp1();
Label lbl1=new Label("No.1");
Label lbl2=new Label("No.2");
Label lbl3=new Label("Result");
TextField txt1=new TextField(20);
TextField txt2=new TextField(20);
TextField txt3=new TextField(20);
Button btn=new Button("ADD");
t.setLayout(new FlowLayout());
txt3.setEditable(false);
t.add(lbl1);t.add(txt1);t.add(lbl2);t.add(txt2);
t.add(lbl3);t.add(txt3);t.add(btn);
btn.addActionListener(s);
t.setTitle("First GUI App....");
t.setSize(250,300);
t.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
System.out.println("On clicking it executes...");
}
}