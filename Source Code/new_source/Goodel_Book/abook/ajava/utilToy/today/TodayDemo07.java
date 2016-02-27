package abook.ajava.utilToy.today;

import java.util.Date;

import java.text.SimpleDateFormat;

public class TodayDemo07 {
	public static void demo() {
		// Memformat tampilan tanggal
		Date dNow = new Date();
		/* Simple, Java 1.0 date printing */
		System.out.println("It is now " + dNow.toString());
		// Use a SimpleDateFormat to print the date our way.
		SimpleDateFormat formatter = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("It is " + formatter.format(dNow));
	}

}
