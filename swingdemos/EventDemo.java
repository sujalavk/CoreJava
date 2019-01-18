package swingdemos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventDemo extends JFrame implements ActionListener{
	JButton  btnSubmit,btnCancel;
	JTextField txtName;
	JLabel lblmsg;
	EventDemo()
	{
       
        
        txtName = new JTextField(10);
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        btnSubmit.addActionListener(this);
        btnCancel.addActionListener(this);
        lblmsg =new JLabel();
        add(txtName);
        add(btnSubmit);
        add(btnCancel);
        add(lblmsg);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Demo");
		setVisible(true);
	}
	
	

	



	@Override
	public void actionPerformed(ActionEvent e) {
		String msg="";
	String cmd=	e.getActionCommand();
	System.out.println(cmd);
	if(cmd=="Submit")
			msg="welcome to "+txtName.getText();
	else if(cmd=="Cancel")
	{
		msg="you clicked cancel button";
		txtName.setText("");
	}
	
	lblmsg.setText(msg);
		
	}

	public static void main(String[] args) {
		new EventDemo();
	}

}
