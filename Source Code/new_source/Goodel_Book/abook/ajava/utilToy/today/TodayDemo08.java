package abook.ajava.utilToy.today;

import java.util.Date;

import java.text.SimpleDateFormat;

public class TodayDemo08 {
	public static void demo() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String input = "1818-11-11";
		System.out.print(input + " parses as ");
		Date t;
		try {
			t = formatter.parse(input);
			System.out.println(t);
		} catch (Exception e) {
			System.out.println("unparseable using " + formatter);
		}
	}

}
