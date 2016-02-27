package abook.ajava.syntaxToy;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class Bool {
  private static boolean P = false;
  private static boolean Q = true;
  private static boolean R = true;

  public static void main(String[] args) {
    // demoBoolean();
    demoTruthTable();
  }

  public static void demoBoolean() {
    System.out.println("P = " + P );
    System.out.println("Q = " + Q );
    System.out.println("R = " + R );

    System.out.println("P && Q || !P && !Q   ==> " + (P && Q || !P && !Q));
    System.out.println("P || Q && !P || !Q   ==> " + (P || Q && !P || !Q));
    System.out.println("0 == 1 ||  0 < 1     ==> " + (0 == 1 ||  0 < 1));
    System.out.println("P && (Q || R)        ==> " + (P && (Q || R)));
    System.out.println("!!P                  ==> " + (!!P));
    // System.out.println("false < true ==>" + (false < true));
  }

  public static void demoTruthTable() {
    // PFormula(); // P
    // NotPFormula();  // !P
    // PAndQFormula(); // P && Q
    // POrQFormula();  // P || Q
    // PAndQAndRFormula(); // P && Q && R
    // PAndQAndRAndSFormula(); // P && Q && R && S

    demo16BoolFunction();
  }

  // Hal 28
  // Logika Matematika, Fungsi Boolean
  // 0. nullPQ
  // 1. andPQ
  // 2. pInhibitionPQ
  // 3. pTransferPQ
  // 4. qInhibitionPQ
  // 5. qTransferPQ
  // 6. xorPQ
  // 7. orPQ
  // 8. norPQ
  // 9. equivalencePQ
  //10. pComplementPQ
  //11. pImplicationPQ
  //12. qComplementPQ
  //13. qImplicationPQ
  //14. nandPQ
  //15. identityPQ

  public static void demo16BoolFunction() {
      nullPQ();
  }

  private static boolean toBool(int i) {
    if (i==0) return false;
    return true;
  }

  private static void PFormula() {
    System.out.println("P      |      P");
    System.out.println("---------------");

    for(int p=0;p<=1;p++) {
      System.out.println(toBool(p) + "  |   "+toBool(p));
    }
  }

  private static void NotPFormula() {
    System.out.println("P      |      !P");
    System.out.println("---------------");

    for(int p=0;p<=1;p++) {
      System.out.println(toBool(p) + "  |   "+(!toBool(p)));
    }
  }

  private static void POrQFormula() {
    System.out.println("   P    |   Q  |   P || Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p) || toBool(q)) );
      }
    }
  }

  private static void PAndQFormula() {
    System.out.println("   P    |   Q  |   P && Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p) && toBool(q)) );
      }
    }
  }

  private static void PAndQAndRFormula() {
    System.out.println("   P    |   Q  |   R  |   P && Q && R");
    System.out.println("-------------------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        for(int r=0;r<=1;r++) {
          System.out.println(toBool(p) + "  |   " + toBool(q) + "  |   " +
                             toBool(r) + "  |   " +
                             (toBool(p) && toBool(q) && toBool(r)));
        }
      }
    }
  }

  private static void PAndQAndRAndSFormula() {
    System.out.println("   P    |   Q  |   R  |   S  |   P && Q && R && S");
    System.out.println("-------------------------------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        for(int r=0;r<=1;r++) {
          for (int s=0;s<=1;s++){
            System.out.println(toBool(p) + "  |   " + toBool(q) + "  |   " +
                               toBool(r) + "  |   " + toBool(s) + "  |   " +
                               (toBool(p) && toBool(q) && toBool(r) && toBool(s)));
          }
        }
      }
    }
  }

  private static void nullPQ() {
    System.out.println("   P    |   Q  |   false");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + false );
      }
    }
  }

  private static void andPQ() {
    System.out.println("   P    |   Q  |   P && Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p) && toBool(q)) );
      }
    }
  }

  private static void pInhibitionPQ() {
    System.out.println("   P    |   Q  |   P && !Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p) && !toBool(q)) );
      }
    }
  }

  private static void pTransferPQ() {
    System.out.println("   P    |   Q  |   P");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p)) );
      }
    }
  }

  private static void qInhibitionPQ() {
    System.out.println("   P    |   Q  |   !P && Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!toBool(p) && toBool(q)) );
      }
    }
  }

  private static void qTransferPQ() {
    System.out.println("   P    |   Q  |   P");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(q)) );
      }
    }
  }

  private static void xorPQ() {
    System.out.println("   P    |   Q  |   P!Q && !PQ");
    System.out.println("-----------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + ((toBool(p) && !toBool(q)) || (!toBool(p) && toBool(q))) );
      }
    }
  }

  private static void orPQ() {
    System.out.println("   P    |   Q  |   P || Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p) || toBool(q)) );
      }
    }
  }

  private static void norPQ() {
    System.out.println("   P    |   Q  |   !(P || Q)");
    System.out.println("----------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!(toBool(p) || toBool(q))) );
      }
    }
  }

  private static void equivalencePQ() {
    System.out.println("   P    |   Q  |   PQ && !P!Q");
    System.out.println("-----------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + ((toBool(p) && toBool(q)) || (!toBool(p) && !toBool(q))) );
      }
    }
  }

  private static void pComplementPQ() {
    System.out.println("   P    |   Q  |   !P");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!toBool(p)) );
      }
    }
  }

  private static void pImplicationPQ() {
    System.out.println("   P    |   Q  |   P || !Q");
    System.out.println("-----------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (toBool(p)  || !toBool(q)) );
      }
    }
  }

  private static void qComplementPQ() {
    System.out.println("   P    |   Q  |   !Q");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!toBool(q)) );
      }
    }
  }

  private static void qImplicationPQ() {
    System.out.println("   P    |   Q  |   !P || Q");
    System.out.println("-----------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!toBool(p)  || toBool(q)) );
      }
    }
  }

  private static void nandPQ() {
    System.out.println("   P    |   Q  |   !(P && Q)");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + (!(toBool(p) && toBool(q))) );
      }
    }
  }

  private static void identityPQ() {
    System.out.println("   P    |   Q  |   true");
    System.out.println("--------------------------");

    for(int p=0;p<=1;p++) {
      for(int q=0;q<=1;q++) {
        System.out.println(toBool(p) + "  |   " + toBool(q)  + "  |   " + true );
      }
    }
  }

}
