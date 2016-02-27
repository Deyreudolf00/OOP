package abook.afield.calendarToy;

public class DateToy {
	private int sec;

	private int min;

	private int hour;

	private int mday;

	private int mon;

	private int year;

	private int wday;

	private int yday;

	private boolean daylight;

	private static final int[] daysInMonths = { 0, 31, 28, 31, 30, 31, 30, 31,
			31, 30, 31, 30, 31 };

	private static final int[] daysInMonthsOfLeapYear = { 0, 31, 29, 31, 30,
			31, 30, 31, 31, 30, 31, 30, 31 };

	private static final String[] dayNames = { "Minggu", "Senin", "Selasa",
			"Rabu", "Kamis", "Jumat", "Sabtu" };

	private static final String[] monthNames = { "", "Januari", "Pebruari",
			"Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
			"Oktober", "Nopember", "Desember" };

	/** Creates a new instance of DateToy */
	public DateToy(int mday, int mon, int year) throws Exception {
		if (!isDateValid(mday, mon, year))
			throw new Exception();
		this.mday = mday;
		this.mon = mon;
		this.year = year;
	}

	public DateToy(int mday, int mon, int year, int hour, int min, int sec)
			throws Exception {
		if (!isDateValid(mday, mon, year))
			throw new Exception();
		if (!isTimeValid(hour, min, sec))
			throw new Exception();
		this.mday = mday;
		this.mon = mon;
		this.year = year;
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public static boolean isDateValid(int dd, int mm, int yy) {
		if (mm < 1 || mm > 12)
			return false;
		if (yy < 1)
			return false;
		if (isLeapYear(yy)) {
			if (dd < 1 || dd > daysInMonths[mm])
				return false;
		} else {
			if (dd < 1 || dd > daysInMonthsOfLeapYear[mm])
				return false;
		}
		return true;
	}

	public static boolean isLeapYear(int yy) {
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

	public static long getDayNumber(int dd, int mm, int yy) throws Exception {
		return calcDayNumber(dd, mm, yy);
	}

	public static int dayOfYear(int dd, int mm, int yy) throws Exception {
		if (!isDateValid(dd, mm, yy))
			throw new Exception();
		DateToy t1 = new DateToy(dd, mm, yy);
		DateToy t2 = new DateToy(1, 1, yy);
		return (int) dateDiff(t1, t2);
	}

	public int dayOfYear() throws Exception {
		DateToy t = new DateToy(1, 1, this.year);
		return (int) dateDiff(t, this);
	}

	public static long dateDiff(DateToy t1, DateToy t2) throws Exception {
		return (getDayNumber(t1.mday, t1.mon, t1.year) - getDayNumber(t2.mday,
				t2.mon, t2.year));
	}

	public static double timeDiff(DateToy t1, DateToy t2) throws Exception {
		long numberOfDays = getDayNumber(t1.mday, t1.mon, t1.year);
		double d1 = numberOfDays * 86400.0 + t1.hour * 3600.0 + t1.min * 60.0
				+ t1.sec;
		numberOfDays = getDayNumber(t2.mday, t2.mon, t2.year);
		double d2 = numberOfDays * 86400.0 + t2.hour * 3600.0 + t2.min * 60.0
				+ t2.sec;

		return (d1 - d2);
	}

	public static String getMonth(int mm, int yy) throws Exception {
		return makeMonth(mm, yy);
	}

	public static boolean isTimeValid(int hh, int mm, int ss) {
		if (hh < 0 || hh > 23)
			return false;
		if (mm < 0 || mm > 59)
			return false;
		if (ss < 0 || ss > 59)
			return false;
		return true;
	}

	public int dayOfWeek() throws Exception {
		long numberOfDays = getDayNumber();
		// System.out.println("numberOfDays = "+numberOfDays);
		return (int) (((numberOfDays % 7) + 5) % 7);
	}

	public String getDayOfWeek() throws Exception {
		return dayNames[dayOfWeek()];
	}

	public static int dayOfWeek(int dd, int mm, int yy) throws Exception {
		long numberOfDays = calcDayNumber(dd, mm, yy);
		return (int) (((numberOfDays % 7) + 5) % 7);
	}

	public static String getDayOfWeek(int dd, int mm, int yy) throws Exception {
		return dayNames[dayOfWeek(dd, mm, yy)];
	}

	public String toString() {
		String str = mday + " " + monthNames[mon] + " " + year + " " + hour
				+ ":" + min + ":" + sec;
		return str;
	}

	static void test01() throws Exception {
		System.out.println(getMonth(9, 1582));
		System.out.println(getMonth(10, 1582));
		System.out.println(getMonth(11, 1582));
	}

	static void test02() throws Exception {
		System.out.println(getMonth(5, 2003));
		System.out.println(getMonth(6, 2003));
		System.out.println(getMonth(7, 2003));
	}

	static void test03() throws Exception {
		DateToy t1 = new DateToy(26, 6, 2003, 12, 0, 0);
		DateToy t2 = new DateToy(26, 6, 2003, 11, 0, 0);
		System.out.println("T1 = " + t1);
		System.out.println("T2 = " + t2);
		System.out.println("Selisih T1 dan T2 = " + timeDiff(t1, t2));
	}

	static void test04() throws Exception {
		DateToy t1 = new DateToy(26, 6, 2003);
		DateToy t2 = new DateToy(26, 6, 2003);
		System.out.println("T1 = " + t1);
		System.out.println("T2 = " + t2);
		System.out.println("Selisih T1 dan T2 = " + timeDiff(t1, t2));
	}

	static void test05() throws Exception {
		System.out.println("27 Maret 2003 adalah " + getDayOfWeek(27, 3, 2006));
	}

	static void test() throws Exception {
		// test01();
		// test02();
		// test03();
		// test04();
		test05();
	}

	public static void main(String[] args) throws Exception {
		test();
	}

	private static String makeMonth(int mm, int yy) throws Exception {
		String str = "";
		if (mm == 10 && yy == 1582) {
			str = makeOct1582();
			return str;
		}

		DateToy t = new DateToy(1, mm, yy);
		int dayOfWeek = t.dayOfWeek();
		// System.out.println("dayOfWeek = "+dayOfWeek);

		int days;
		if (t.isLeapYear())
			days = daysInMonthsOfLeapYear[mm];
		else
			days = daysInMonths[mm];

		int[] daysToPrint = new int[42];
		for (int i = dayOfWeek, j = 1; j <= days; i++, j++) {
			daysToPrint[i] = j;
		}

		str += monthNames[mm] + " " + yy + "\n";
		str += "S\tM\tTu\tW\tTh\tF\tS\n";
		for (int rows = 0; rows < 6; rows++) {
			for (int i = 0; i < 7; i++) {
				if (daysToPrint[(rows * 7) + i] != 0)
					str += daysToPrint[(rows * 7) + i];
				str += "\t";
			}
			str += "\n";
		}

		return str;
	}

	private static String makeOct1582() {
		String str = "";
		str += "OKTOBER 1582\n" + "S\tM\tTu\tW\tTh\tF\tS\n"
				+ "\t1\t2\t3\t4\t15\t16\n" + "17\t18\t19\t20\t21\t22\t23\n"
				+ "24\t25\t26\t27\t28\t29\t30\n" + "31\n";
		return str;
	}

	private boolean isDateValid() {
		return isDateValid(mday, mon, year);
	}

	private boolean isLeapYear() {
		return isLeapYear(year);
	}

	private boolean isTimeValid() {
		return isTimeValid(hour, min, sec);
	}

	private long getDayNumber() throws Exception {
		return calcDayNumber(mday, mon, year);
	}

	private static long calcDayNumber(int dd, int mm, int yy) throws Exception {
		long numberOfDays;

		if (!isDateValid(dd, mm, yy))
			throw new Exception();

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
		numberOfDays += dd;
		// System.out.println("Di DateToDayNumber = "+numberOfDays);
		// Kurangi dengan 10 hari yang dipotong dari kalendar
		if (numberOfDays > 577737L)
			numberOfDays -= 10;
		return numberOfDays;
	}

	private DateToy dayNumberToDate(long numberOfDays) throws Exception {
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

		return (new DateToy(dd, mm, yy));
	}

}
