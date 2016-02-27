package abook.ajava.utilToy.today;

import java.util.Date;
import java.util.Calendar;

public class TodayDemo06 {
	public static void demo() {
		Calendar ane = Calendar.getInstance();
		ane.set(89, 1, 15);
		Date aneBirthday = new Date(ane.getTimeInMillis());
		System.out.println("Waktu : " + aneBirthday);
	}
}
