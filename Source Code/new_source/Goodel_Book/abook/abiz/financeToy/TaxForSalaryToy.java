package abook.abiz.financeToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT Inspired by : Theory and problems of
 *         programming with Pascal Byron S. Gottriied, page 13
 */
public class TaxForSalaryToy {

	private double gross = 0.0;

	private double taxRate = 0.0;

	private double net = 0.0;

	private double tax = 0.0;

	/** Creates a new instance of TaxForSalaryToy */
	public TaxForSalaryToy(double gross, double taxRate) {
		this.gross = gross;
		this.taxRate = taxRate;

		calc();
	}

	private void calc() {
		tax = taxRate * gross;
		net = gross - tax;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public double getTax() {
		return tax;
	}

	public double getGross() {
		return gross;
	}

	public double getNet() {
		return net;
	}

	public String toString() {
		String str = "Penghasilan kotor  = " + gross + "\n"
				+ "Rate pajak         = " + taxRate + "\n"
				+ "Pajak penghasilan  = " + tax + "\n"
				+ "Penghasilan bersih = " + net;
		return str;
	}

	static void test() {
		TaxForSalaryToy t = new TaxForSalaryToy(1000, .1);
		System.out.println(t);
	}

	public static void main(String[] args) {
		test();
	}
}
