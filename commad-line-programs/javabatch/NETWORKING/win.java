import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
////////////////////////////////////////////////////////////////////////////////////////
class win extends JFrame  {
boolean f=true;
final int port=5555;
JPanel pnl;
//boolean reset1=true,reset2=true,reset3=true;
JTextArea txt1,txt2;
JTextField addtxt1,addtxt2,addtxt3,addtxt4;
JButton sndbtn,clrbtn,extbtn,encrptbtn;
JLabel l1,l2,l3;
JScrollPane sntscrl,msgscrl;
ImageIcon img;
win2 w2;
byte msg[],encmsg[];
Random rand;
Socket skt1,skt2;
InetAddress ipadd;
byte ip[];
InputStream rcv;
OutputStream send;
ServerSocket ser;
int avl;
thr thr1;
//.......................................  

class thr implements Runnable{
Thread t1;
thr(){
       t1=new Thread(this); }
public void run(){try{
      while(true){//System.out.println("1");
					               if(skt2==null){ skt2=ser.accept();
                                                          rcv=skt2.getInputStream();}
              //System.out.println("w");
                                                           avl= rcv.available();
                                                          // System.out.println(avl);
                                                          if(avl>0){byte rcvmsg[]=new byte[avl];
                                                          rcv.read(rcvmsg);
                                                         
                                                          decr(rcvmsg);
                                                         // for(int i=0;i<avl;i++)
                                                         // System.out.print(rcvmsg[i]);
                                                          }
                  //System.out.println("2");
                  try{t1.sleep(200);
                     }catch(InterruptedException ie){System.out.print("as"+ie);}
                 }}catch(Exception e){System.out.print("sf"+e);}
}

void st(){t1.start();}
}
//.......................................  
class act implements ActionListener{

public void actionPerformed(ActionEvent e){}
}
//..........................................
class change extends KeyAdapter{

                   public void keyPressed(KeyEvent a){try{skt1.close();
                                  skt2.close();skt1=null;skt2=null;}catch(Exception s){}
                                  
                           System.out.println("asf");}
                    }
//..........................................
win() {  
      //...................................
        try{ser=new ServerSocket(port);}catch(Exception d){}
           //..............framesetting
          setVisible(true);
          setTitle("Encryption/Decryption");
          setBounds(20,20,620,620);
          setLayout(null);
          setResizable(false);
          rand=new Random();
          thr1= new thr();
       //.............................  
         w2=new win2();
      //.............................
          pnl= new JPanel();
          pnl.setBounds(0,0,600,600);
          pnl.setLayout(null);
          Container cnt=getContentPane();
          cnt.add(pnl);
          
          l1=new JLabel("Sent Message");
          l1.setBounds(50,50,200,50);
          pnl.add(l1);         
          
          txt1=new JTextArea();
          txt1.setEditable(false);
          sntscrl=new JScrollPane(txt1); 
          sntscrl.setBounds(50,100,400,150);         
          pnl.add(sntscrl);
          
          l2=new JLabel("To ");
          l2.setBounds(50,300,100,50);
          pnl.add(l2);
          
          addtxt1=new JTextField("127");    
          addtxt1.setBounds(100,320,70,20);
          addtxt1.setColumns(3);
          pnl.add(addtxt1);
         
          addtxt2=new JTextField("0");    
          addtxt2.setBounds(175,320,70,20);
          addtxt2.setColumns(3);
          pnl.add(addtxt2);
          
          addtxt3=new JTextField("0");    
          addtxt3.setBounds(255,320,70,20);
          addtxt3.setColumns(3);
          pnl.add(addtxt3);
      
          addtxt4=new JTextField("1");    
          addtxt4.setBounds(335,320,70,20);
          addtxt4.setColumns(12);
          pnl.add(addtxt4);
            
          l3=new JLabel("Type Your message");
          l3.setBounds(50,350,200,50);
          pnl.add(l3);
          //.............................................................
           addtxt1.addKeyListener(new change());
           addtxt2.addKeyListener(new change());
           addtxt3.addKeyListener(new change());
           addtxt4.addKeyListener(new change());
          //............................................................. 
          txt2=new JTextArea();
          msgscrl=new JScrollPane(txt2); 
          msgscrl.setBounds(50,400,400,150);         
          pnl.add(msgscrl);
 
          sndbtn=new JButton("Send");
          sndbtn.setBounds(470,400,100,30);
          pnl.add(sndbtn);
          sndbtn.addActionListener(                                              //
                                   new act(){                     
          public void actionPerformed(ActionEvent e) { ip=new byte[4];
                                                       ip[0]=(byte)Integer.parseInt(addtxt1.getText());
                                                       ip[1]=(byte)Integer.parseInt(addtxt2.getText());
                                                       ip[2]=(byte)Integer.parseInt(addtxt3.getText());
                                                       ip[3]=(byte)Integer.parseInt(addtxt4.getText());
                                                    try{ipadd=InetAddress.getByAddress(ip);
                                                        //System.out.println(ipadd);                                                     
                                                        if(skt1==null)skt1=new Socket(ipadd,port);
                                                         System.out.println(skt1);
                                                        }
                                                     catch(Exception x){}
                                                     txt1.append("\n LocalHost:>> "+txt2.getText());
                                                     encr();txt2.setText("");
                                                     try{                                                      
                                                       
                                                       send = skt1.getOutputStream();
                                                       send.write(encmsg);
                                                       send.flush();
                                                       
                                                       if(f==true){
                                                       thr1.st();
                                                           f=false; }
                                                                                                              
                                                       }catch(Exception ex){System.out.println(ex);}
                                                                                                     }            //
               }
                                   );                                            //
          clrbtn=new JButton("Clear");
          clrbtn.setBounds(470,450,100,30);
          pnl.add(clrbtn);
          clrbtn.addActionListener(                                              //
                                   new act(){                     
          public void actionPerformed(ActionEvent e){txt2.setText("");}            //
               }
                                   );                                            //

          extbtn=new JButton("Exit");
          extbtn.setBounds(470,500,100,30);
          pnl.add(extbtn);
          extbtn.addActionListener(                                              //
                                   new act(){                     
          public void actionPerformed(ActionEvent e){System.exit(0);}            //
               }
                                   );                                            //
    
           encrptbtn=new JButton("  ");
          encrptbtn.setBounds(470,100,100,150);
          img=new ImageIcon("syncWizard.gif");
          encrptbtn.setIcon(img);
          pnl.add(encrptbtn);
          encrptbtn.addActionListener(                                              //
                                   new act(){                     
          public void actionPerformed(ActionEvent e){   w2.show();   }            //
               }
                                   );                                            //
             //...........
          addWindowListener(
             new WindowAdapter(){
             public void windowClosing(WindowEvent e){try{ser.close();skt1.close();
                                  skt2.close();}catch(Exception s){} System.exit(0);}
              }      );
      }

//''Encryption''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  void encr(){
        msg=txt2.getText().getBytes();
        byte key[]=new byte[1];
        rand.nextBytes(key);
       encmsg=new byte[msg.length+1];
       encmsg[0]=key[0]; 
       for(int i=0;i<msg.length;i++){
           encmsg[i+1]=(byte)(msg[i]^key[0]);
             }

  w2.txt1.append(new String(encmsg));
  //System.out.println(key[0]);
      }
//....Decryption.......................................................................................
void decr(byte str1[]){if(str1.length>0){
                     byte key=str1[0];
                     byte str2[]=new byte[str1.length-1];
                     for(int i=1;i<str1.length;i++)
                     str2[i-1]=(byte)(key^str1[i]);
                     txt1.append("\n"+ipadd.toString().substring(1,ipadd.toString().length())+">> "+(new String(str2)));
               }            }
//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
}
//////////////////////////////////////////////////////////////////////////////////////////



class pro {
public static void main(String a[])throws NullPointerException{
win w1=new win();
    w1.show();}
}
/////////////////////////////////////////////////////////////////////////////////////////

