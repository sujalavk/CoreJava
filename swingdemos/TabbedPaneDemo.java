package swingdemos;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPaneDemo	extends JFrame
{
	JRadioButton r1,r2;
	JTextField t1;
	ButtonGroup bg;
	JComboBox cmb;
	TabbedPaneDemo()
	{
		t1=new JTextField(10);
		cmb=new JComboBox();
		cmb.addItem("India");
		cmb.addItem("NRI");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JPanel  jp1=new JPanel();
		
		jp1.add(r1);
		jp1.add(r2);
		JPanel  jp2=new JPanel();
		
		jp2.add(t1);
		jp2.add(cmb);
		
		JTabbedPane jt=new JTabbedPane();
		jt.addTab("Gender", jp1);
		jt.addTab("Name", jp2);
		add(jt);
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public  static void main(String args[])
	{
		new TabbedPaneDemo();
	}
	
}


