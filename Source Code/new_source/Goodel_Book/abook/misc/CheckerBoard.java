package abook.misc;
import javax.swing.JOptionPane;

public class CheckerBoard {
	  public CheckerBoard() {
	  }

	  public static void main(String[] args) {
	    demo();
	  }

	  public static void demo() {
	    String xStr = JOptionPane.showInputDialog("Masukkan bilangan bulat  : ");
	    int n = Integer.parseInt(xStr);

	    for(int i=0;i<=n;i++){
	      for(int j=0;j<=n;j++) {
	        if(i % 2 == 0) {
	          System.out.print("*");
	          System.out.print(" ");
	        } else {
	          System.out.print(" ");
	          System.out.print("*");
	        }
	      }
	      System.out.println();
	    }
	    System.exit(0);
	  }
	}