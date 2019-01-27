import java.awt.*;
import java.awt.event.*;

class SumApp2 implements ActionListener
{
private static TextField txt1,txt2,txt3;
public static void main(String ar[])
{
Frame t=new Frame();
SumApp2 s=new SumApp2();
Label lbl1=new Label("No.1");
Label lbl2=new Label("No.2");
Label lbl3=new Label("Result");
txt1=new TextField(20);
txt2=new TextField(20);
txt3=new TextField(20);
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
try
{
Button ba=(Button)e.getSource();
double a=Double.parseDouble(txt1.getText());
double b=Double.parseDouble(txt2.getText());
double c=a+b;
txt3.setText(Double.toString(c));
}catch(Exception ec){}
}
}