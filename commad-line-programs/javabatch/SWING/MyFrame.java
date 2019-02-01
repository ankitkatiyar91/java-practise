import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
JTextField txt1,txt2,txt3;
public MyFrame()
{
//Container c=getContentPane();
JLabel lbl1=new JLabel("Number 1");
JLabel lbl2=new JLabel("Number 2");
JLabel lbl3=new JLabel("Result");
txt1=new JTextField(15);
txt2=new JTextField(15);
txt3=new JTextField(15);
JButton btn=new JButton("ADD");
setLayout(new FlowLayout());
add(lbl1);add(txt1);add(lbl2);add(txt2);
add(lbl3);add(txt3);add(btn);
txt3.setEditable(false);

ActionListener listener=new ActionListener(){
public void actionPerformed(ActionEvent e)
{
try
{
double a=Double.parseDouble(txt1.getText());
double b=Double.parseDouble(txt2.getText());
double c=a+b;
txt3.setText(Double.toString(c));
}catch(Exception er){System.out.println(er);}
}
};

setSize(250,250);
btn.addActionListener(listener);
setTitle("First SWING App...");
setVisible(true);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String ar[])
{
new MyFrame();
}
}