package areaText;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TextAreaTest().createFrame();

	}
	
	private void createFrame() {
		setSize(200,200);
		setLayout(null);
		final JTextArea area=new JTextArea("Test");
		area.setSize(50, 50);
		area.setBounds(0, 0, 100, 100);
		add(area);
		
		JButton  button=new JButton("Save");
		button.setBounds(100, 100, 80, 30);
		add(button);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s=area.getText();
				System.out.println("GOT-"+s);
				try {
					File f=new File("testFile.txt");
					System.out.println("Writing "+f.getAbsolutePath());
					FileWriter fr=new FileWriter(f);
					fr.write(s);
					fr.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
	}

}
