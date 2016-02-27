package abook.afield.amath.randomToy;

public class RandomToy {

	private int[] zrng = { 1973272912, 281629770, 20006270, 1280689831,
			2096730329, 193376050, 913566091, 246780520, 1363774876, 604901985 };

	/** Creates a new instance of RandomToy */
	public RandomToy() {
	}

	public int get(int stream) {
		return zrng[stream];
	}

	public double getRandom(int stream) {
		return (double) (2 * (zrng[stream] / 256) + 1) / 16777216.0;
	}

	public void next(int stream) {
		int b2e15 = 32768;
		int b2e16 = 65536;
		int modlus = 2147483647;
		int mult1 = 24112;
		int mult2 = 26143;
		int hi15, hi31, low15, lowprd, ovflow, zi;

		zi = zrng[stream];
		hi15 = zi / b2e16;
		lowprd = (zi - hi15 * b2e16) * mult1;
		low15 = lowprd / b2e15;
		hi31 = hi15 * mult1 + low15;
		ovflow = hi31 / b2e15;
		zi = (((lowprd - low15 * b2e15) - modlus) + (hi31 - ovflow * b2e15)
				* b2e16)
				+ ovflow;

		if (zi < 0)
			zi = zi + modlus;
		hi15 = zi / b2e16;
		lowprd = (zi - hi15 * b2e16) * mult2;
		hi31 = hi15 * mult2 + low15;
		ovflow = hi31 / b2e15;
		zi = (((lowprd - low15 * b2e16) - modlus) + (hi31 - ovflow * b2e15)
				* b2e16)
				+ ovflow;
		if (zi < 0)
			zi = zi + modlus;
		zrng[stream] = zi;
	}

	public void setSeed(int stream, int seed) {
		zrng[stream] = seed;
	}

	static void test01() {
		RandomToy t = new RandomToy();
		for (int i = 0; i < 100; i++, t.next(1)) {
			System.out.print("" + t.get(1) + "\t");
			System.out.println("" + t.getRandom(1));
			if (i % 8 == 0)
				System.out.println();
		}
	}

	static void test() {
		test01();
	}

	public static void main(String[] args) {
		test();
	}
}
