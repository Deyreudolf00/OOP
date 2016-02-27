package abook.afield.amath.numberToy;

public class PrimeToy {
	private long number;

	private boolean fPrime = true;

	// Flag untuk prima,
	// true bila bilangan prima
	// false bila bukan bilangan prima

	public PrimeToy(long number) {
		this.number = number;
		doPrimeTest();
	}

	public long getNumber() {
		return number;
	}

	public boolean isPrime() {
		return fPrime;
	}

	public String toString() {
		String str = "";
		if (fPrime)
			str += number + " adalah bilangan prima";
		else
			str += number + " adalah bukan bilangan prima";
		return str;
	}

	static void test() {
		for (long i = 100001; i < 100050; i += 2) {
			System.out.println(new PrimeToy(i));
		}
	}

	public static void main(String args[]) {
		test();
	}

	private void doPrimeTest() {
		for (long i = 2; i <= (long) Math.floor(Math.sqrt(number)); i++) {
			if ((number % i) == 0) {
				fPrime = false;
				return;
			}
		}
	}

}