import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
////////////////////////////////////////////////////////////////////////////////////////
class win2 extends JFrame {
JPanel pnl;
JTextArea txt1;
JButton extbtn;
JLabel l1;
JScrollPane sntscrl;
//.......................................  
class act implements ActionListener{
public void actionPerformed(ActionEvent e){} }
//..........................................
win2() {  
      //..............framesetting
     // setVisible(true);
          setTitle("Encryption/Decryption");
          setBounds(20,20,620,620);
          setLayout(null);
          setResizable(false);
      //.............................
          pnl= new JPanel();
          pnl.setBounds(0,0,600,600);
          pnl.setLayout(null);
          Container cnt=getContentPane();
          cnt.add(pnl);
          l1=new JLabel("Sent Message In Encrypted Form");
          l1.setBounds(50,50,200,50);
          pnl.add(l1);         
          txt1=new JTextArea();
          txt1.setEditable(false);
          sntscrl=new JScrollPane(txt1); 
          sntscrl.setBounds(50,100,500,350);         
          pnl.add(sntscrl);
          extbtn=new JButton("Exit");
          extbtn.setBounds(470,500,100,30);
          pnl.add(extbtn);
          extbtn.addActionListener(                                              //
                                   new act(){                     
          public void actionPerformed(ActionEvent e){dispose();}            //
               }                                   );                                            //       
     //...........
          addWindowListener(
             new WindowAdapter(){
             public void windowClosing(WindowEvent e){ dispose();}
              }                );      }
}
