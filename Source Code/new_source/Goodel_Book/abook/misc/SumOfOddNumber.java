package abook.misc;

public class SumOfOddNumber {
	  public static void main(String[] args) {
	    // demoSumWithFor();
	    // demoSumWithWhile();
	    // demoSumWithDoWhile();

	    // demoSumWithFor2();
	    // demoSumWithWhile2();
	    demoSumWithDoWhile2();
	  }

	  public static void demoSumWithFor() {
	    int sum = 0;
	    for (int i=1;i<=99;i+=2 ) {
	      sum += i;
	    }

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	  }

	  public static void demoSumWithFor2() {
	    int sum = 0;
	    for (int i=1;;i+=2 ) {
	      sum += i;
	      if (i==99) break;
	    }

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	  }

	  public static void demoSumWithWhile() {
	    int sum = 0;
	    int i = 1;
	    while (i <= 99) {
	      sum += i;
	      i += 2;
	    }

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	}

	  public static void demoSumWithWhile2() {
	    int sum = 0;
	    int i = 1;
	    while (true) {
	      sum += i;
	      i += 2;
	      if (i>99) break;
	    }

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	  }

	  public static void demoSumWithDoWhile() {
	    int sum = 0;
	    int i = 1;
	    do {
	      sum += i;
	      i += 2;
	    } while (i <= 99);

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	  }

	  public static void demoSumWithDoWhile2() {
	    int sum = 0;
	    int i = 1;
	    do {
	      sum += i;
	      i += 2;
	      if (i > 99) break;
	    } while (true);

	    System.out.println("Jumlah 1 + 3 + 5 + ... + 99 = " + sum);
	  }

	}