/*
 * staticHToy.java
 *
 * Created on June 15, 2003, 8:45 AM
 */

package colToy.hashToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class staticHToy {
    private Comparable items[];
    private int numberOfItems;
    
    /** Creates a new instance of staticHToy */
    public staticHToy(int numberOfItems) {
        this.numberOfItems = numberOfItems;
        items = new Comparable[numberOfItems];
    }
    
    // Preprocessing for string
    private int fold(String str){
        int sum = 0;
        for(int i=0;istr.length;i++){
            sum += (int)str.charAt(i);
        }
    }
}
