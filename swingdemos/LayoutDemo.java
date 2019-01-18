package swingdemos;



import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Display extends JFrame
{
	Display()
	{
	
		setLayout(new GridLayout(2,4));
		
			JLabel l1=new JLabel("MYsore");
			JLabel l2=new JLabel("Hubli");
			JLabel l3=new JLabel("Belgaum");
			JLabel l4=new JLabel("Baglakot");
			JLabel l5=new JLabel("NIIT");
	    	add(l1);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			
			setVisible(true);
			setSize(200, 800);
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
public class LayoutDemo {
	public static void main(String[] args) {
		Display disp=new Display();
	}

}



