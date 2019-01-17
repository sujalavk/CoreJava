package swingdemos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BroderLayoutDemo extends JFrame {
	
	BroderLayoutDemo(){
		
		JButton button,button1, button2, button3,button4;
		button = new JButton("left");
		button1 = new JButton("right");
		button2 = new JButton("top");
		button3 = new JButton("bottom");
		button4 = new JButton("center");
		add(button,BorderLayout.WEST);
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.NORTH);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.CENTER);
		
		setSize(300,300);  
		setVisible(true);  
	}
	public  static void main(String[] args){
		new BroderLayoutDemo();
	}
}