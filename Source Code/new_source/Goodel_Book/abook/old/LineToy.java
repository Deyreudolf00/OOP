/*
 * LineToy.java
 *
 * Created on June 2, 2003, 7:11 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class LineToy {
    PointToy endA, endB;
    
    /** Creates a new instance of LineToy */
    public LineToy () {
        endA=new PointToy();
        endB=new PointToy();
    }
    
    public LineToy (PointToy newA, PointToy newB) {
        endA = new PointToy(newA);
        endB = new PointToy(newB);
    }
    
    public LineToy (LineToy L) {
        endA= new PointToy(L.endA);
        endB= new PointToy(L.endB);
    }

    public void moveBy(double dX, double dY) {
        endA.moveBy(dX,dY);
        endB.moveBy(dX,dY);
    }

    public String toString() {
        return("A => x="+endA.getX()+" y="+endB.getY()+" B => y="+endB.getX()+" y="+endB.getY());
    }
    
    static void test(){
       LineToy t = new LineToy();
       System.out.println(t);

       t.moveBy(2.0, 3.0);
       System.out.println(t);
    }
    
    public static void main (String args[]) {
        test();
    }

}
