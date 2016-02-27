package abook.ajava.utilToy.date;

import java.util.Date;

public class DateDemo04 {
	public static void demo() {
		Date d = new Date(1089472215000L);

		System.out.println("Date d = new Date(1089472215000L) = " + d);
		System.out.println("d.getTime() =  " + d.getTime());

		d.setTime(1089472215000L);
		System.out.println("d.setTime(1089472215000L) = " + d);
		System.out.println("d.getTime() =  " + d.getTime());
	}

}
