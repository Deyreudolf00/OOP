package abook.afield.amath.numberToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT Inspired by : Java : How to Program Deitel
 *         Deitel, page 8, exercise 2.33
 */
public class PowerTableToy {

	private int numberOfRows;

	/** Creates a new instance of PowerTableToy */
	public PowerTableToy() {
	}

	public PowerTableToy(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public void setNumber(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void printTable() {
		System.out.println("Number      Square        Cube");
		for (int i = 0; i < numberOfRows; i++) {
			System.out.println(i + "         " + (i * i) + "             "
					+ (i * i * i));
		}

	}

	static void test() {
		PowerTableToy p = new PowerTableToy(11);
		p.printTable();
	}

	public static void main(String[] args) {
		test();
	}

}
