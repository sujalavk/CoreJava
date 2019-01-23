package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberCurrencyFormatDemo {
	public static void main(String[] args) {
	
		NumberFormat nf=NumberFormat.getNumberInstance();
		System.out.println(nf.format(100000000));
		Locale l= new Locale("de","DE");
		nf=NumberFormat.getNumberInstance(l);
		System.out.println(nf.format(100000000));
	// currency format
		
		NumberFormat cf=NumberFormat.getCurrencyInstance(l);
		System.out.println(cf.format(100000000));
		Locale lindia= new Locale("en","IN");
	     cf=NumberFormat.getCurrencyInstance(lindia);
		System.out.println(cf.format(100000000));
}
}
