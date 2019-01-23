package localization;

import java.util.ResourceBundle;

public class LocalizingTextDemo {

	public static void main(String[] args) {
		ResourceBundle rs=ResourceBundle.getBundle("localization/IndainMsgBundle");
		String message=rs.getString("msg");
		System.out.println(message);
	      rs=ResourceBundle.getBundle("localization/inMsgBundle");
		 message=rs.getString("msg");
		System.out.println(message);
	}
	

}
