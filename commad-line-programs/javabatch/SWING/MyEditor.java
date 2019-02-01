import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class MyEditor extends JFrame implements ActionListener
{
JTextArea txt;
public MyEditor()
{
txt=new JTextArea();
add(new JScrollPane(txt));
txt.setFont(new Font("Times new Roman",Font.BOLD,18));
JMenuBar bar=new JMenuBar();
JMenu m1=new JMenu("File");
JMenu m2=new JMenu("Edit");
JMenuItem i1=new JMenuItem("New"); 
JMenuItem i2=new JMenuItem("Open");
JMenuItem i3=new JMenuItem("Save");
JMenuItem i4=new JMenuItem("Cut");
JMenuItem i5=new JMenuItem("Copy");
JMenuItem i6=new JMenuItem("Paste");
m1.add(i1);m1.add(i2);m1.add(i3);m2.add(i4);
m2.add(i5);m2.add(i6);bar.add(m1);bar.add(m2);
setJMenuBar(bar);
setSize(600,500);
setTitle("My Editor");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);
i6.addActionListener(this);
}
public void actionPerformed(ActionEvent es)
{
String s=es.getActionCommand();
if(s.equals("Open"))
{
JFileChooser jfc=new JFileChooser();
jfc.showOpenDialog(this);
File f=jfc.getSelectedFile();
try
{
FileInputStream in=new FileInputStream(f);
byte data[]=new byte[in.available()];
in.read(data);
txt.setText(new String(data));
in.close();
}catch(Exception e){}
}
else if(s.equals("Save"))
{
JFileChooser jfc=new JFileChooser();
jfc.showSaveDialog(this);
File f=jfc.getSelectedFile();
try
{
FileOutputStream out=new FileOutputStream(f);
out.write(txt.getText().getBytes());
out.close();
}catch(Exception e){}
}
else
txt.setText(s+" is selected");
}
public static void main(String ar[])
{
new MyEditor();
}
}

