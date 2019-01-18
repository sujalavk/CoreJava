package swingdemos;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MultiEventDemo extends JFrame implements ItemListener 
{    
	JComboBox country;              

public MultiEventDemo()  
{
	setLayout(new FlowLayout());      
	setSize(200,400);                
	country = new JComboBox();        
	country.addItem("England");      
	country.addItem("China");       
	country.addItem("Turkey");      
	country.addItem("Russia");
	country.addItemListener(this);
	add(country);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override
public void itemStateChanged(ItemEvent e) {
	JFrame jf=new JFrame();
	   JOptionPane.showMessageDialog(jf, "You have selected " + country.getSelectedItem(),"message",JOptionPane.WARNING_MESSAGE);   
	
}

public static void main(String[] args) {
	MultiEventDemo m=new MultiEventDemo();
}
}

