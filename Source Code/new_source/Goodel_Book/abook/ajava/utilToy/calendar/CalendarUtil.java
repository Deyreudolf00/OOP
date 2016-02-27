package abook.ajava.utilToy.calendar;

public class CalendarUtil {
	/**
	 * getDayName
	 */
	public static String getDayName(int day_of_week) {
		return dayName[0][day_of_week - 1];
	}

	/**
	 * getDayName
	 */
	public static String getDayName(int language, int day_of_week) {
		return dayName[language][day_of_week - 1];
	}

	/**
	 * getMonthName
	 */
	public static String getMonthName(int month) {
		return monthName[0][month];
	}

	public static String getMonthName(int language, int month) {
		return monthName[language][month];
	}

	public static final int INDONESIA = 0;

	public static final int ENGLISH = 1;

	private static String dayName[][] = {
			{ "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" },
			{ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
					"Saturday" } };

	private static String monthName[][] = {
			{ "Januari", "Pebruari", "Maret", "April", "Mei", "Juni", "Juli",
					"Agustus", "September", "Oktober", "Nopember", "Desember" },
			{ "January", "February", "March", "April", "May", "June", "July",
					"August", "September", "October", "November", "December" } };

}
