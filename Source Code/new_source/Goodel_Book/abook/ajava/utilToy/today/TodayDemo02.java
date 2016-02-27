package abook.ajava.utilToy.today;

import java.util.Date;

public class TodayDemo02 {
	public static void demo() {
		Date date = new Date();
		System.out.println("Waktu saat ini : " + date.getTime());
		System.out
				.println("Milidetik sejak 1 Januari 1970 : " + date.getTime());
	}

}
