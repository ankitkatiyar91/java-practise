import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class ListFrame extends JFrame implements ListSelectionListener
{
JList list;
JTextField txt;
public ListFrame()
{
setLayout(null);
txt=new JTextField(20);
String item[]={"Amit","Anil","Ankit","Ansul","Arpit","Ravi","Virender","Satyendra"};
list=new JList(item);
JLabel l1=new JLabel("Select item from list...");
add(l1);
list.setVisibleRowCount(5);
JScrollPane pane=new JScrollPane(list);
add(pane);
JLabel l2=new JLabel("Selected items");
add(l2);
add(txt);
l1.setBounds(30,20,150,30);
pane.setBounds(50,60,80,90);
l2.setBounds(30,160,130,30);
txt.setBounds(50,200,250,30);
setSize(275,300);
setTitle("List Demo....");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
list.addListSelectionListener(this);
}

public void valueChanged(ListSelectionEvent e)
{
Object o[]=list.getSelectedValues();
StringBuffer b=new StringBuffer();
for(int i=0;i<o.length;i++)
b.append((String)o[i]+"_");
txt.setText(b.toString());
}

public static void main(String ar[])
{
new ListFrame();
}
}