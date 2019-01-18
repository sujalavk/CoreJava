package swingdemos;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TableDemo extends JFrame {
	  JTable employee;    
	  String[] columnNames = 
		  {"ID", "First Name", "Last Name", "Department"};   
	  Object[][] data = {{"T101", "Peter", "Parker", "Admin"},			  
			             {"T102", "Kathy", "White", "IT"},
			             {"T103", "John", "Smith", "Accounts"}}; 
	  public TableDemo()     {  
		  employee = new JTable(data, columnNames);           
	  setTitle("Frame with JTable");        
	  setSize(300,300);       
	  setVisible(true);                
	  add(employee);    
	  }    
	  public static void main(String[] args)     {    
		  TableDemo obj = new TableDemo();     }   

}
