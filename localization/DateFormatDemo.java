package localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Locale l1=new Locale("en","IN");
		Locale l2=Locale.FRENCH;
		/*Locale l=Locale.getDefault();//to know default locale
		System.out.println(l);*/
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,l1);
		Date today=new Date();
		System.out.println(df.format(today));
		
	     df = DateFormat.getDateInstance(DateFormat.FULL,l2);
		
		System.out.println(df.format(today));
	}

}