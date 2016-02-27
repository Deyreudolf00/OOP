/*
 * AddressToy.java
 *
 * Created on June 5, 2003, 7:07 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class AddressToy {
    private String street="";
    private String city="";
    private String postCode="";
    
    /** Creates a new instance of AddressToy */
    public AddressToy(String street, String city, String postCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }
    
    public String toString(){
        String str = 
            "Alamat \n"+
            "Jalan    : "+street+"\n"+
            "Kota     : "+city+"\n"+
            "Kode pos : "+postCode;
        return str;
    }
}
