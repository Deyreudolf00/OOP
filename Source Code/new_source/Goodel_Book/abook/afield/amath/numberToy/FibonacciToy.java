package abook.afield.amath.numberToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT Inspired by : Object Oriented Software
 *         Construction In subject : Object as machine
 * 
 * File ini adalah pengerjaan barisan fibonacci sebagaimana biasanya
 * 
 * Teknik yang disarankan Bertrand Meyer, memandang barisan sebagai mesin ada di
 * file FibonacciToy.java
 * 
 * Reference : Kruse, page 107
 */

public class FibonacciToy {

	private int number;

	/** Creates a new instance of FibonaccyToy */
	public FibonacciToy() {
	}

	public FibonacciToy(int number) {
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	private long calcFibonaccy(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (calcFibonaccy(n - 1) + calcFibonaccy(n - 2));
	}

	public long calcNumber() {
		return calcFibonaccy(number);
	}

	static void test() {
		FibonacciToy f = new FibonacciToy(10);
		System.out.println("Fibonacci 10 = " + f.calcNumber());
	}

	public static void main(String args[]) {
		test();
	}
}
