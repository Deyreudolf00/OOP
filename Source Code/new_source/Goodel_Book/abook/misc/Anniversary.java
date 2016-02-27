package abook.misc;
import java.util.Date;

public class Anniversary {
	  public static void main(String[] args) {
	    demo();
	  }

	  @SuppressWarnings("unchecked")
	  public static void demo (){
	      Date today=new Date();
	      System.out.println("Hari ini : "+today.toLocaleString()+
	          " ("+today.toGMTString()+")");

	      Date birthday=new Date(89,10,14,8,30,00);
	      System.out.println("Tanggal lahir saya : "+
	          birthday.toString()+" ("+birthday.toGMTString()+")");

	      Date anniversary=new Date("Jun 21, 1986");
	      System.out.println("Tanggal lahir : "+
	          anniversary+" ("+anniversary.toGMTString()+")");
	  }
	}
