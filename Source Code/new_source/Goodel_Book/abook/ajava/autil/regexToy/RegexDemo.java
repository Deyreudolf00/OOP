package abook.ajava.autil.regexToy;

import java.util.regex.*;

public class RegexDemo {
	private static String[] emails = { "bbgHariyanto@yahoo.com",
			"bh3d@plasa.com", "bh@goodel.org", "bbgHariyanto@goodel.org",
			"b_h@goodel.org" };

	private static String regex = "[A-Za-z]+_[A-Za-z]+@[A-Za-z]+\\.org";

	public static void main(String[] args) throws Exception {
		demo_01();
	}

	public static void demo_00() {
		for (int i = 0; i < emails.length; i++) {
			if (isValidEmail(emails[i])) {
				System.out.println(emails[i] + " adalah " + regex);
			} else {
				System.out.println(emails[i] + " bukan " + regex);
			}
		}
	}

	public static boolean isValidEmail_00(String email) {
		if ((email.indexOf("@") > 0) && (email.endsWith(".org"))) {
			return true;
		}

		return false;
	}

	public static boolean isValidEmail(String email) {
		if (email.matches(regex))
			return true;

		return false;
	}

	public static void demo_01() {
		String candidate = "A Matcher examines the results of applying a pattern.";

		// menentukan pola yang perlu ditemukan
		String regex = "\\ba\\w*\\b";
		Pattern p = Pattern.compile(regex);

		// mengekstrak Matcher untuk menemukan teks String
		Matcher m = p.matcher(candidate);
		String val = null;
		
		// menampilkan string masukan
		System.out.println("INPUT: " + candidate);

		// menampilkan pola yang dicari
		System.out.println("REGEX: " + regex + "\r\n");

		// memeriksa Matcher, dan mengekstrak semua hasil pencocokan
		while (m.find()) {
			val = m.group();
			System.out.println("MATCH: " + val);
		}

		// jika ada yang ditemukan, nyatakan
		if (val == null) {
			System.out.println("NO MATCHES: ");
		}
	}
}
