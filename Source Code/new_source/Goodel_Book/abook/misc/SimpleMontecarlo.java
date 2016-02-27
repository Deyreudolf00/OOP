package abook.misc;

import java.util.Random;
public class SimpleMontecarlo {
  static long[] gray = {0, 0, 0, 0, 0};
  static long[] white = {0, 0, 0, 0, 0};

  static Random _r1 = new Random();

  public static void main(String[] args) {
    double x, y;

    long startTime = System.currentTimeMillis();
    for (long i = 0; i < 100000; i++) {
      if (isInGray(10.0d * _r1.nextDouble(), 10.0d * _r1.nextDouble())) {
        gray[0]++;
      }

    }

    gray[1] = gray[0];
    for (long i = 100000; i < 100000000; i++) {
      if (isInGray(10.0d * _r1.nextDouble(), 10.0d * _r1.nextDouble())) {
        gray[1]++;
      }
    }


    gray[2] = gray[1];
    for (long i = 100000000; i < 1000000000; i++) {
      if (isInGray(10.0d * _r1.nextDouble(), 10.0d * _r1.nextDouble())) {
        gray[2]++;
      }
    }

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println("Waktu yang diperlukan : " + elapsedTime+ " milidetik");

    double area = ((double)gray[0]/(double)100000) * 100.0d;
    System.out.println("gray[0] = "+gray[0]);
    System.out.println("gray[0]/100000 = "+((double)gray[0]/(double)100000));
    System.out.println("Luas = "+area);
    System.out.println();

    area = ((double)gray[1]/(double)100000000) * 100.0d;
    System.out.println("gray[1] = "+gray[1]);
    System.out.println("gray[1]/100000000 = "+((double)gray[1]/(double)100000000));
    System.out.println("Luas = "+area);

    area = ((double)gray[2]/(double)1000000000) * 100.0d;
    System.out.println("gray[2] = "+gray[2]);
    System.out.println("gray[2]/1000000000 = "+((double)gray[2]/(double)1000000000));
    System.out.println("Luas = "+area);
  }

/*
  public static void main(String[] args) {
    double x, y;

    long startTime = System.currentTimeMillis();
    for (long i = 0; i < 100000; i++) {
      x = 10.0d * _r1.nextDouble();
      y = 10.0d * _r1.nextDouble();

      if (isInGray(x, y)) {
        gray[0]++;
      }

    }

    gray[1] = gray[0];
    for (long i = 100000; i < 100000000; i++) {
      x = range0_10(_r1.nextDouble());
      y = range0_10(_r1.nextDouble());

      if (isInGray(x, y)) {
        gray[1]++;
      }
    }


    gray[2] = gray[1];
    for (long i = 100000000; i < 1000000000; i++) {
      x = range0_10(_r1.nextDouble());
      y = range0_10(_r1.nextDouble());

      if (isInGray(x, y)) {
        gray[2]++;
      }
    }

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println("Waktu yang diperlukan : " + elapsedTime+ " milidetik");

    double area = ((double)gray[0]/(double)100000) * 100.0d;
    System.out.println("gray[0] = "+gray[0]);
    System.out.println("gray[0]/100000 = "+((double)gray[0]/(double)100000));
    System.out.println("Luas = "+area);
    System.out.println();

    area = ((double)gray[1]/(double)100000000) * 100.0d;
    System.out.println("gray[1] = "+gray[1]);
    System.out.println("gray[1]/100000000 = "+((double)gray[1]/(double)100000000));
    System.out.println("Luas = "+area);

    area = ((double)gray[2]/(double)1000000000) * 100.0d;
    System.out.println("gray[2] = "+gray[2]);
    System.out.println("gray[2]/1000000000 = "+((double)gray[2]/(double)1000000000));
    System.out.println("Luas = "+area);
  }

 // Versi 430 detik
 */

  private static boolean isInGray(double x, double y) {
    if (x >= 0.0 && x <= 8.0 && y >= 0.0 && y <= 8.0) return true;
    return false;
  }

  private static boolean isInWhite(double x, double y) {
    if (x >= 0.0 && x <= 10.0) {
      return true;
    }
    return false;
  }

  private static double range0_10(double value) {
    return (10.0d * value);
  }
}
