package p496;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		
		double num = 123456789.789;
		DecimalFormat df = new DecimalFormat("\u00A6 #,### %");
		
		String str = df.format(num);
		System.out.println(str);

		SimpleDateFormat sdf = new SimpleDateFormat("yy-M-dd, hh:mm:S, E a");
		String str2 = sdf.format(new Date());
		System.out.println(str2);
		
	}

}
