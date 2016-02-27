package abook.ajava.utilToy.date;

import java.util.Date;

public class DateDemo06 {
	public static void demo() {
		// Deprecated getter methods
		Date d = new Date();

		System.out.println("Date d = new Date()   = " + d);
		System.out.println("d.get = d.getDate()   = " + d.getDate());
		System.out.println("d.get = d.getDay()    = " + d.getDay());
		System.out.println("d.get = d.getHours()  = " + d.getHours());
		System.out.println("d.get = d.getMonth()  = " + d.getMonth());
		System.out.println("d.get = d.getSeconds()= " + d.getSeconds());
		System.out.println("d.get = d.getYear()   = " + d.getYear());
		System.out.println("d.get = d.getTimezoneOffset()   = "
				+ d.getTimezoneOffset());
	}
}
