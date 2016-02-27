package abook.afield.calendarToy;

public class NextDateToy {
	private double datetime;

	private int mday;

	private int mon;

	private int year;

	private boolean fValid = false;

	private static final int[] daysInMonths = { 0, 31, 28, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	private static final int[] daysInMonthsOfLeapYear = { 0, 31, 29, 31, 30,
			31, 30, 31, 31, 30, 31, 30, 31 };

	private static final String[] dayNames = { "Minggu", "Senin", "Selasa",
			"Rabu", "Kamis", "Jumat", "Sabtu" };

	private static final String[] monthNames = { "", "Januari", "Pebruari",
			"Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
			"Oktober", "Nopember", "Desember" };

	/** Creates a new instance of NextDateToy */
	public NextDateToy(int mday, int mon, int year) throws Exception {
		datetime = (double) dateToDayNumber(mday, mon, year);
	}

	public String toString() {
		String str = "";
		str += datetime + "\n";
		try {
			dayNumberToDate();
			str += mday + " " + monthNames[mon] + " " + year;
		} catch (Exception e) {
			System.out.println("Error di dayNumberToDate");
		}
		return str;
	}

	static void test() throws Exception {
		System.out.println("Masukkan : 26-6-2003");
		System.out.println(new NextDateToy(1, 1, 2003));
	}

	public static void main(String[] args) throws Exception {
		test();
	}

	private boolean isDateValid(int mday, int mon, int year) {
		if (mon < 1 || mon > 12)
			return false;
		if (year < 1)
			return false;
		if (isLeapYear(year)) {
			if (mday < 1 || mday > daysInMonths[mon])
				return false;
		} else {
			if (mday < 1 || mday > daysInMonthsOfLeapYear[mon])
				return false;
		}
		return true;
	}

	private long dateToDayNumber(int mday, int mon, int year) throws Exception {
		long numberOfDays;
		int mm, yy;

		if (!isDateValid(mday, mon, year))
			throw new Exception();

		yy = year;
		mm = mon;

		// Kalikan dengan jumlah hari di tahun normal
		numberOfDays = (yy - 1) * 365L;

		// Ditambah hari untuk hari-hari di tahun kabisat
		numberOfDays += (yy - 1) / 4L;

		// Kurangi dengan tahun abad yang bukan kabisat
		numberOfDays -= (yy - 1) / 100L;
		numberOfDays += (yy - 1) / 400L;

		// Sebelum 1582, semua tahun abad adalah kabisat
		// sesuaikan.
		// Jika tahun > 1582, maka tambahkan 12 hari untuk tahun abad
		// 100, 200, 300, 500, 600, 700, 900,
		// 1000, 1100, 1300, 1400, 1500
		// Selain itu, harus dihitung

		if (yy - 1 > 1582L)
			numberOfDays += 12L;
		else {
			numberOfDays += (yy - 1) / 100L;
			numberOfDays -= (yy - 1) / 400L;
		}

		// Tambahkan jumlah hari di tahun yang sedang berlangsung
		if (!isLeapYear(yy)) {
			for (int i = mm - 1; i > 0; i--)
				numberOfDays += daysInMonths[i];
		} else {
			for (int i = mm - 1; i > 0; i--)
				numberOfDays += daysInMonthsOfLeapYear[i];
		}
		numberOfDays += mday;
		// System.out.println("Di DateToDayNumber = "+numberOfDays);
		// Kurangi dengan 10 hari yang dipotong dari kalendar
		if (numberOfDays > 577737L)
			numberOfDays -= 10;
		return numberOfDays;
	}

	private void dayNumberToDate() throws Exception {
		long numberOfDays = (long) Math.floor(datetime);
		int dd, mm, yy;
		long daysLeft;

		if (numberOfDays > 577737L)
			numberOfDays += 10L;

		yy = (int) (numberOfDays / 365);
		daysLeft = numberOfDays % 365L;

		if (yy < 1700)
			daysLeft -= (yy / 4);
		else {
			daysLeft -= (yy / 4);
			daysLeft += (yy / 100);
			daysLeft -= (yy / 400);
			daysLeft -= 12;
		}

		while (daysLeft <= 0) {
			if (isLeapYear(yy)) {
				yy -= 1;
				daysLeft += 366;
			} else {
				yy -= 1;
				daysLeft += 365;
			}
		}

		yy += 1;

		dd = (int) daysLeft;
		mm = 0;

		if (isLeapYear(yy)) {
			for (int i = 1; i <= 12; i++) {
				mm = i;
				if (dd <= daysInMonthsOfLeapYear[i])
					break;
				else
					dd -= daysInMonthsOfLeapYear[i];
			}
		} else {
			for (int i = 1; i <= 12; i++) {
				mm = i;
				if (dd <= daysInMonths[i])
					break;
				else
					dd -= daysInMonths[i];
			}
		}

		// System.out.println("Di dayNumberToDate : dd="+dd+" mon="+mm+"
		// year="+yy);

		if (!isDateValid(dd, mm, yy))
			throw new Exception();
		else {
			mday = dd;
			mon = mm;
			year = yy;
		}
	}

	private boolean isLeapYear() {
		return isLeapYear(year);
	}

	private static boolean isLeapYear(int yy) {
		if (yy % 4 != 0)
			return false;
		if (yy < 1582)
			return true; // Semua tahun dapat dibagi 4 adalah kabisat
		if (yy % 100 != 4)
			return true; // Tahun dapat dibagi 4 tapi tidak dapat dibagi 100,
							// berarti kabisat
		if (yy % 400 != 0)
			return false; // Tahun dapat dibagi 100, tapi tidak dapat dibagi
							// 400 adalah bukan kabisat
		else
			return true; // jika dapat dibagi 400, maka kabisat
	}

}
