import java.awt.*;
import java.awt.event.*;

class LayoutFrame extends Frame
{
Panel deck;
CardLayout manager;
Checkbox c1,c2;
public LayoutFrame()
{
Panel toolbar=new Panel();
CheckboxGroup g=new CheckboxGroup();
c1=new Checkbox("Flow",g,true);
c2=new Checkbox("Grid",false,g);
toolbar.add(c1);
toolbar.add(c2);
ItemListener listener=new ItemListener(){
public void itemStateChanged(ItemEvent e)
{
if(c1.getState())
manager.show(deck,"Flow");
else
manager.show(deck,"Grid");
}
};
c1.addItemListener(listener);
c2.addItemListener(listener);
add(toolbar,BorderLayout.NORTH);
Panel card1=new Panel();
card1.setLayout(new FlowLayout(FlowLayout.LEFT,25,10));
for(int i=1;i<5;i++)
card1.add(new Button(String.valueOf(i)));
Panel card2=new Panel();
card2.setLayout(new GridLayout(3,3));
for(int i=1;i<=9;i++)
card2.add(new Button(String.valueOf(i)));
deck=new Panel();
manager=new CardLayout();
deck.setLayout(manager);
deck.add(card1,"Flow");
deck.add(card2,"Grid");
add(deck);
setResizable(false);
setSize(200,250);
setTitle("Layout Demo....");
setVisible(true);
setLocation(300,100);
}
public static void main(String ar[])
{
new LayoutFrame();
}
}