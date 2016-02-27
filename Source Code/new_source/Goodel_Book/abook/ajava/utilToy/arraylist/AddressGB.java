/*
 * AddressGB.java
 *
 * Created on January 31, 2004, 7:38 AM
 */

package abook.ajava.utilToy.arraylist;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class AddressGB {
    /** Creates a new instance of AddressGB */
    private String name;
    private String street;
    private String city;
    private String province;
    private String postCode;
    
    /** Creates a new instance of AddressGB */
    public AddressGB(String name, String street, String city, String province, String postCode){
        this.name = name;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postCode = postCode;
    }
    
    public String toString(){
        String str = 
            "Nama    : " + name + "\n" + 
            "Alamat  : " + street + "\n" + 
            "Kota    : " + city + "\n" +
            "Propinsi: " + province + "\n" +
            "Kode pos: " + postCode;
        return str;
    }
}
