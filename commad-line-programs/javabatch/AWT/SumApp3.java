import java.awt.*;
import java.awt.event.*;

class SumApp3 implements ActionListener
{
private static TextField txt1,txt2,txt3;
static Button btn1,btn2,btn3,btn4;
public static void main(String ar[])
{
Frame t=new Frame();
SumApp3 s=new SumApp3();
Label lbl1=new Label("No.1");
Label lbl2=new Label("No.2");
Label lbl3=new Label("Result");
txt1=new TextField(20);
txt2=new TextField(20);
txt3=new TextField(20);
btn1=new Button("ADD");
btn2=new Button("SUB");
btn3=new Button("MUL");
btn4=new Button("DIV");
t.setLayout(new FlowLayout());
txt3.setEditable(false);
t.add(lbl1);t.add(txt1);t.add(lbl2);t.add(txt2);
t.add(lbl3);t.add(txt3);t.add(btn1);t.add(btn2);
t.add(btn3);t.add(btn4);
btn1.addActionListener(s);
btn2.addActionListener(s);
btn3.addActionListener(s);
btn4.addActionListener(s);
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
double c;
if(ba==btn1)
c=a+b;
else if(ba==btn2)
c=a-b;
else if(ba==btn3)
c=a*b;
else
c=a/b;
txt3.setText(Double.toString(c));
}catch(Exception ec){}
}
}