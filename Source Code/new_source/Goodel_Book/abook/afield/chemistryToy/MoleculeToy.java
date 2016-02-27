package abook.afield.chemistryToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT Inspired by : C++ Program Design : An
 *         Introduction to Programming and Object Oriented Design James P Cohon
 *         dan Jack W Davidson, page 109
 * 
 */

public class MoleculeToy {

	public static final double AVOGADRO = 6.02e23;

	public static final int CARBON = 12;

	public static final int HYDROGEN = 1;

	private double mass = 0.0;

	private int nrOfHydrogen = 0;

	private int nrOfCarbon = 0;

	private int massPerAvogadro = 0;

	private double molecule = 0.0;

	/** Creates a new instance of MoleculeToy */
	public MoleculeToy(double mass, int nrOfCarbon, int nrOfHydrogen) {
		this.mass = mass;
		this.nrOfCarbon = nrOfCarbon;
		this.nrOfHydrogen = nrOfHydrogen;

		calcMolecules();
	}

	private void calcMolecules() {
		massPerAvogadro = (nrOfCarbon * CARBON) + (nrOfHydrogen) * HYDROGEN;
		molecule = (mass / massPerAvogadro) * AVOGADRO;
	}

	public String toString() {
		String str = "Hidrokarbon" + "\n" + "Rumus hidrokarbon, C" + nrOfCarbon
				+ "H" + nrOfHydrogen + "\n" + "Massa per Avogadro : "
				+ massPerAvogadro + "\n" + "Massa              : " + mass
				+ " gram\n" + "Jumlah molekul     : " + molecule;
		return str;
	}

	static void test() {
		MoleculeToy t = new MoleculeToy(30, 2, 6);
		System.out.println(t);
	}

	public static void main(String[] args) {
		test();
	}
}
