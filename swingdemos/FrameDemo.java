package swingdemos;
import java.awt.FlowLayout;

import javax.swing.*;

import org.jdatepicker.JDatePicker;

public class FrameDemo extends JFrame{
	FrameDemo() {
		JLabel  lblname=new JLabel("Name");
		JLabel  lblpassword=new JLabel();
		lblpassword.setText("Password");
		JTextField txtname=new JTextField(10);
		JTextField txtpwd=new JTextField(10);
		JRadioButton rdmale=new JRadioButton("Male");
		JRadioButton rdfemale=new JRadioButton("FeMale");
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(rdmale);
		bg.add(rdfemale);
		JButton btnsubmit=new  JButton("Submit");
		JComboBox cmbnationality=new JComboBox();
		cmbnationality.addItem("Indian");
		cmbnationality.addItem("NRI");
		add(lblname);
		add(txtname);
		add(lblpassword);
		add(txtpwd);
		add(rdmale);
		add(rdfemale);
		add(cmbnationality);
		add(btnsubmit);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Demo");
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new FrameDemo();

	}

}
