package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
         Locale l=new Locale("in","IN");
		  ResourceBundle rb= ResourceBundle.getBundle("localization/in_IN_Bundle",l);
		  String msg=rb.getString("msg");
		  System.out.println("Message"+  msg );

	}

}
