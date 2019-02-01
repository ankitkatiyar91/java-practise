import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class WindowsCalc extends JFrame implements ActionListener
{
JTextField txt;
public WindowsCalc()
{

txt=new JTextField(10);
//add(new JScrollPane(txt));
//txt.setFont(new Font("TimesNewRoman",Font.BOLD,16));
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("a");
JButton b11=new JButton("b");
JButton b12=new JButton("c");
JButton b13=new JButton("d");
JButton b14=new JButton("e");
JButton b15=new JButton("f");
JButton b16=new JButton("g");
JButton b17=new JButton("h");
JButton b18=new JButton("i");
JButton b19=new JButton("j");
JButton b20=new JButton("k");
JButton b21=new JButton("l");
JButton b22=new JButton("m");
JButton b23=new JButton("n");
JButton b24=new JButton("o");
JButton b25=new JButton("p");
JButton b26=new JButton("manish");
JButton b27=new JButton("q");
JButton b28=new JButton("r");
JButton status=new JButton("ON");


JMenuBar bar=new JMenuBar();

JMenu m1=new JMenu("View");
JMenu m2=new JMenu("Edit");
JMenu m3=new JMenu("help");

JMenuItem i1=new JMenuItem("notepad");
JMenuItem i2=new JMenuItem("standard");
JMenuItem i3=new JMenuItem("Scientific");
JMenuItem i4=new JMenuItem("programmers");
JMenuItem i5=new JMenuItem("statistics");
JMenuItem i6=new JMenuItem("history");
JMenuItem i7=new JMenuItem("digit grouping");
JMenuItem i8=new JMenuItem("Basic");
JMenuItem i9=new JMenuItem("unit conversion");
JMenuItem i10=new JMenuItem("date calculation");
JMenuItem i11=new JMenuItem("worksheets");
JMenuItem i12=new JMenuItem("copy");
JMenuItem i13=new JMenuItem("paste");
JMenuItem i14=new JMenuItem("history");
JMenuItem i15=new JMenuItem("view help");
JMenuItem i16=new JMenuItem("about calculator");

setLayout(null);
m1.add(i1);
m1.add(i2);
m1.add(i3);
m1.add(i4);
m1.add(i5);
m1.add(i6);
m1.add(i7);
m1.add(i8);
m1.add(i9);
m1.add(i10);
m1.add(i11);
m2.add(i12);
m2.add(i13);
m2.add(i14);
m3.add(i15);

m3.add(i16);
m3.add(i5);
bar.add(m1);
bar.add(m2);
bar.add(m3);

add(txt);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
add(b13);
add(b14);
add(b15);
add(b16);
add(b17);
add(b18);
add(b19);
add(b20);
add(b21);
add(b22);
add(b23);
add(b24);
add(b25);
add(b26);
add(b27);
add(b28);
add(status);

i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);
i6.addActionListener(this);
i7.addActionListener(this);
i8.addActionListener(this);
i9.addActionListener(this);
i10.addActionListener(this);
i11.addActionListener(this);
i12.addActionListener(this);
i13.addActionListener(this);
i14.addActionListener(this);
i15.addActionListener(this);

txt.setBounds(10,10,205,30);
status.setBounds(225,10,60,30);
b1.setBounds(10,70,50,30);
b2.setBounds(70,70,50,30);
b3.setBounds(130,70,50,30);
b4.setBounds(190,70,50,30);
b5.setBounds(250,70,50,30);
b6.setBounds(10,110,50,30);
b7.setBounds(70,110,50,30);
b8.setBounds(130,110,50,30);
b9.setBounds(190,110,50,30);
b10.setBounds(250,110,50,30);
b11.setBounds(10,150,50,30);
b12.setBounds(70,150,50,30);
b13.setBounds(130,150,50,30);
b14.setBounds(190,150,50,30);
b15.setBounds(250,150,50,30);
b16.setBounds(10,190,50,30);
b17.setBounds(70,190,50,30);
b18.setBounds(130,190,50,30);
b19.setBounds(190,190,50,30);
b20.setBounds(250,190,50,30);
b21.setBounds(10,230,50,30);
b22.setBounds(70,230,50,30);
b23.setBounds(130,230,50,30);
b24.setBounds(190,230,50,30);
b25.setBounds(250,230,50,30);
b26.setBounds(10,270,100,30);
b27.setBounds(120,270,50,30);
b28.setBounds(180,270,50,30);

setJMenuBar(bar);
setSize(350,360);
setTitle("Gandhi g RAm RAm");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent es)
{
String s=es.getActionCommand();
if(s.equals("notepad"))
{


}



//else if(s.equals("Save"))
//{
//JFileChooser jfc=new JFileChooser();
//jfc.showSaveDialog(this);
//File f=jfc.getSelectedFile();
//try{
//FileOutputStream out=new FileOutputStream(f);
//out.write(txt.getText().getBytes());
//out.close();
//}
//catch(Exception o)
//{
//System.out.println(o);
//}

//}
else
{
txt.setText(s+"is selected.....@@@@");
}
}
public static void main(String ar[])
{
new WindowsCalc();
}}

