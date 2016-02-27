package abook.ajava.utilToy.today;

import java.util.Date;
import java.util.Calendar;

public class TodayDemo01 {
	public static void demo() {
		// Maksud : untuk mengetahui waktu saat ini
		System.out.println("Waktu saat ini : " + (new Date()));
		System.out.println("Waktu saat ini : "
				+ (Calendar.getInstance().getTime()));
	}
}
