import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DialogFrame extends JFrame implements ActionListener
{
JTextField txt;
public DialogFrame()
{
txt=new JTextField(15);
JLabel lbl=new JLabel("Text");
JButton btn1=new JButton("MDB");
JButton btn2=new JButton("IDB");
JButton btn3=new JButton("CDB");
setLayout(new FlowLayout());
add(lbl);add(txt);add(btn1);
add(btn2);add(btn3);
setSize(250,250);
setTitle("Dialog Box Demo...");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("MDB"))
JOptionPane.showMessageDialog(this,txt.getText());
else if(str.equals("IDB"))
{
String text=JOptionPane.showInputDialog(this,"Enter Your Name");
txt.setText("Hello "+text);
}else
{
int a=JOptionPane.showConfirmDialog(this,"Swing is better than AWT????????");
if(a==JOptionPane.YES_OPTION)
{
txt.setText("Yes Better");
}else if(a==JOptionPane.NO_OPTION)
{
txt.setText("NO");
}else
txt.setText("Can't say");
}
}

public static void main(String ar[])
{
new DialogFrame();
}
}
