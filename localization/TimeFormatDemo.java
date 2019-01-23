package localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeFormatDemo {

	public static void main(String[] args) {
		Locale locale=new Locale("ge","GE");
		DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL,locale);
		
		Date today=new Date();
		String time=df.format(today);
		System.out.println(time);
	}
}
