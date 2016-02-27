package abook.afield.economy.loanToy;

public abstract class Loan {
	public Loan() {
	}

	public Loan(double principal, double interestRate) {
		this.principal = principal;
		this.interestRate = interestRate;
	}

	public static void main(String[] args) {
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setPaymentTable(double[][] paymentTable) {
		this.paymentTable = paymentTable;
	}

	public void setNrTerm(int nrTerm) {
		this.nrTerm = nrTerm;
	}

	public double getPrincipal() {
		return principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double[][] getPaymentTable() {
		return paymentTable;
	}

	public int getNrTerm() {
		return nrTerm;
	}

	/**
	 * printPaymentTable
	 */
	public void printPaymentTable() {
		System.out.println("============================================");
		System.out.println("    Payment   Interest   Remaining Principal");
		for (int i = 0; i < nrTerm; i++) {
			System.out.println("    " + paymentTable[i][Loan.PAYMENT] + "  "
					+ paymentTable[i][Loan.INTEREST] + "   "
					+ +paymentTable[i][Loan.PRINCIPAL]);
		}
		System.out.println("============================================");
	}

	abstract void createPaymentTable();

	public static final int MAX_TERM = 120;

	public static final int NR_COLUMNS = 3;

	public static final int PAYMENT = 0;

	public static final int INTEREST = 1;

	public static final int PRINCIPAL = 2;

	private double principal = 0.0; // 0.0 <= principal

	private double interestRate = 0.0; // 0.0 <= interestRate <= 1.00

	protected double[][] paymentTable = new double[MAX_TERM][NR_COLUMNS];

	private int nrTerm = 0;

}
