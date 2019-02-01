import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class GameApplet extends Applet implements ActionListener
{
int number,count;
Label lblmsg,lblcounter;
TextField txt;
public void init()
{
setBackground(Color.gray);
setForeground(Color.black);
setFont(new Font("Times new Roman",Font.BOLD,14));
}

public void start()
{
Random r=new Random();
number=r.nextInt(100);
count=0;
setLayout(null);
Label lbl1=new Label("Welcome to number guessing game");
Label lbl2=new Label("To play game guess the number(0-100)selected by applet");
Label lbl3=new Label("Number");
txt=new TextField();
lblmsg=new Label();
lblcounter=new Label();
Button btn=new Button("Submit");
//Graphics g=btn.getGraphics();
//g.setColor(Color.blue);
add(lbl1);add(lbl2);add(lbl3);
add(txt);add(lblmsg);add(lblcounter);add(btn);
lbl1.setBounds(50,20,600,25);
lbl2.setBounds(50,55,600,25);
lbl3.setBounds(50,90,65,25);
txt.setBounds(140,90,100,25);
btn.setBounds(150,125,100,25);
lblmsg.setBounds(50,195,300,25);
lblcounter.setBounds(50,230,300,25);
btn.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
try
{
count++;
int userno=Integer.parseInt(txt.getText());
if(userno==number)
{
lblmsg.setText("You have won...");
}
else if(userno>number)
{
lblmsg.setText("Try a little lower...");
}
else
{
lblmsg.setText("try a little higher...");
}
lblcounter.setText("No. of attempts: "+count);
}catch(Exception ex){}
}
}
