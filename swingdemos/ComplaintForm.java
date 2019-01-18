package swingdemos;
import javax.swing.*;

	public class ComplaintForm extends JFrame
	{
	     JLabel lblEName, lblEID, lblESex, lblEmail, lblCN, lblDepart, lblSuprv, lblPB, lblGriev, lblSettle;
	     JButton btnSubmit, btnCancel;
	     JTextField txtEName, txtEID, txtEmail, txtCN, txtSuprv;
	     JTextArea txtGriev, txtSettle;
	     JComboBox cmbDepart;
	     JRadioButton rbtnMale, rbtnFemale;
	     JCheckBox cbInfra, cbFood, cbCab, cbWE;
	     
	     public ComplaintForm()
	     {
	         lblEName = new JLabel("Employee Name:");
	         lblEID = new JLabel("Employee ID:");
	         lblESex = new JLabel("Sex:");
	         lblEmail = new JLabel("Email:");
	         lblCN = new JLabel("Contact No:");
	         lblDepart = new JLabel("Department:");
	         lblSuprv = new JLabel("Supervisor:");
	         lblPB = new JLabel("Problem Category:");
	         lblGriev = new JLabel("Please describe the details of your grievances:");
	         lblSettle = new JLabel("Please list the settlement you are requesting:");
	         
	         btnSubmit = new JButton("Submit");
	         btnCancel = new JButton("Cancel");
	         
	         txtEName = new JTextField();
	         txtEID = new JTextField();
	         txtEmail = new JTextField();
	         txtCN = new JTextField();
	         txtSuprv = new JTextField();
	         
	         txtGriev = new JTextArea();
	         txtSettle = new JTextArea();
	         
	         cmbDepart = new JComboBox();
	         
	         rbtnMale = new JRadioButton("Male");
	         rbtnFemale = new JRadioButton("Female");
	         
	         cbInfra = new JCheckBox("Infrastructure");
	         cbFood = new JCheckBox("Food");
	         cbCab = new JCheckBox("Cab");
	         cbWE = new JCheckBox("Working Environment");
	         
	        setTitle("The Complaint Form");
	        setSize(540,570);
	        setVisible(true);
	         
	         
	     }
	     
	     public void addComponent()
	     {
	         setLayout(null);
	         
	         lblEName.setBounds(10, 20, 100, 20);
	         add(lblEName);
	         
	         txtEName.setBounds(120, 20, 150, 20);
	         add(txtEName);
	         
	         lblEID.setBounds(280, 20, 100, 20);
	         add(lblEID);
	         
	         txtEID.setBounds(370, 20, 150, 20);
	         add(txtEID);
	         
	         lblESex.setBounds(10, 50, 50, 20);
	         add(lblESex);
	         
	         rbtnMale.setBounds(120, 50, 70, 20);
	         add(rbtnMale);
	         
	         rbtnFemale.setBounds(200, 50, 100, 20);
	         add(rbtnFemale);
	         
	         lblEmail.setBounds(10,80, 100,20);
	         add(lblEmail);
	         
	         txtEmail.setBounds(120, 80, 150, 20);
	         add(txtEmail);
	         
	         lblCN.setBounds(280, 80, 150, 20);
	         add(lblCN);
	         
	         txtCN.setBounds(370, 80, 150, 20);
	         add(txtCN);
	         
	         lblDepart.setBounds(10, 110, 100,20);
	         add(lblDepart);
	         
	         cmbDepart.setBounds(120, 110, 150, 20);
	         cmbDepart.addItem("Select");
	         cmbDepart.addItem("Admin");
	         cmbDepart.addItem("IT");
	         cmbDepart.addItem("Sales");
	         
	         add(cmbDepart);
	         
	         lblSuprv.setBounds(280, 110, 100, 20);
	         add(lblSuprv);
	         
	         txtSuprv.setBounds(370,110, 150,20);
	         add(txtSuprv);
	         
	         lblPB.setBounds(10,140, 120, 20);
	         add(lblPB);
	         
	         cbInfra.setBounds(140,140,150,20);
	         add(cbInfra);
	         
	         cbFood.setBounds(300, 140, 150, 20);
	         add(cbFood);
	         
	         cbCab.setBounds(140,170,150,20);
	         add(cbCab);
	         
	         cbWE.setBounds(300,170,150,20);
	         add(cbWE);  
	         
	         lblGriev.setBounds(10,200,300,20);
	         add(lblGriev);
	         
	         txtGriev.setBounds(10,230,500,100);
	         add(txtGriev);
	         
	         lblSettle.setBounds(10,340,300,20);
	         add(lblSettle);
	         
	         txtSettle.setBounds(10,370,500,100);
	         add(txtSettle);
	                  
	         btnSubmit.setBounds(300,500,100,25);
	         add(btnSubmit);
	         
	         btnCancel.setBounds(410,500,100,25);
	         add(btnCancel);
	         
	         setResizable(false);
	         
	         
	     }
	    public static void main(String[] args) 
	    {
	        ComplaintForm obj = new ComplaintForm();
	        obj.addComponent();
	    }
	}


