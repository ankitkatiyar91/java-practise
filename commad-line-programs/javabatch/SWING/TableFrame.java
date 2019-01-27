import java.awt.*;
import javax.swing.*;

class TableFrame extends JFrame
{
public TableFrame()
{
String s[]={"name","Extension","ID#"};
Object [][]data={
	{"Amit","406","102"},
	{"Amit","406","102"},
{"Amit","406","102"},
{"Amit","406","102"},
{"Amit","406","102"}
};
JTable table=new JTable(data,s);
JScrollPane jsp=new JScrollPane(table);
add(jsp);
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String ar[])
{
new TableFrame();
}
}
