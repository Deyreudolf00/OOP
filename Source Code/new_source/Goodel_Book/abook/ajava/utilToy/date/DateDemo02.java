package abook.ajava.utilToy.date;

import java.util.Date;

public class DateDemo02 {
	public static void demo() {
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = d1;

		System.out.println("Date d1 = new Date() = " + d1);
		System.out.println("Date d2 = new Date() = " + d2);
		System.out.println("d1 = d3 = " + d3);

		System.out.println("d1.after(d2) =  " + d1.after(d2));
		System.out.println("d1.before(d2) =  " + d1.before(d2));
		System.out.println("d1.compareTo(d2) =  " + d1.compareTo(d2));

		System.out.println("d1.equals(d2) =  " + d1.equals(d2));
		System.out.println("d1.equals(d3) =  " + d1.equals(d3));

		// Ajaib karena menghasilkan yang sama
		// Alasan karena pada milidetik terdekat
	}
}
