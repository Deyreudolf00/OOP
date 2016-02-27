package abook.abiz.financeToy;

public class KursToy {
	private double usdSell, usdBuy;

	private double poundSell, poundBuy;

	private double audSell, audBuy;

	private double sdSell, sdBuy;

	private double myrSell, myrBuy;

	private double hkdSell, hkdBuy;

	private double yenSell, yenBuy;

	private double euroSell, euroBuy;

	/** Creates a new instance of KursToy */
	public KursToy() {
	}

	public KursToy(double[] sell, double[] buy) {
		usdSell = sell[0];
		usdBuy = buy[0];

		poundSell = sell[1];
		poundBuy = buy[1];

		audSell = sell[2];
		audBuy = buy[2];

		sdSell = sell[3];
		sdBuy = buy[3];

		myrSell = sell[4];
		myrBuy = buy[4];

		hkdSell = sell[5];
		hkdBuy = buy[5];

		yenSell = sell[6];
		yenBuy = buy[6];

		euroSell = sell[7];
		euroBuy = buy[7];
	}

	public double getUSDSell() {
		return usdSell;
	}

	public double getUSDBuy() {
		return usdBuy;
	}

	public double getPoundSell() {
		return usdSell;
	}

	public double getPoundBuy() {
		return usdBuy;
	}

	public double getAUDSell() {
		return usdSell;
	}

	public double getAUDBuy() {
		return usdBuy;
	}

	public double getSDSell() {
		return usdSell;
	}

	public double getSDBuy() {
		return usdBuy;
	}

	public double getMYRSell() {
		return usdSell;
	}

	public double getMYRBuy() {
		return usdBuy;
	}

	public double getHKDSell() {
		return usdSell;
	}

	public double getHKDBuy() {
		return usdBuy;
	}

	public double getYenSell() {
		return usdSell;
	}

	public double getYenBuy() {
		return usdBuy;
	}

	public double getEuroSell() {
		return usdSell;
	}

	public double getEuroBuy() {
		return usdBuy;
	}

	public String toString() {
		String str = "Mata uang    Beli    Jual\n" + "USD         "
				+ getUSDSell() + "   " + getUSDBuy();
		return str;
	}

	static void test() {
		double[] sell = { 8129.00, 13241.33, 5381.40, 4714.38, 2138.93,
				1042.33, 68.3204, 9460.53 };
		double[] buy = { 8211.00, 13381.47, 5439.47, 4764.70, 2161.07, 1052.88,
				69.3204, 9560.07 };

		KursToy t = new KursToy(sell, buy);
		System.out.println(t);
	}

	public static void main(String[] args) {
		test();
	}
}
