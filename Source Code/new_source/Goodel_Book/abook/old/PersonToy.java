/*
 * PersonToy.java
 *
 * Created on May 26, 2003, 3:27 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class PersonToy {
    String name;
    String addressLine1;
    String addressLine2;
    String city;
    int age;
    
    /** Creates a new instance of PersonToy */
    public PersonToy() {
	name = "";
	addressLine1 = "";
	addressLine2 = "";
	city = "";
	age = 0;
    }

    public PersonToy(String newName, String newAddressLine1, String newAddressLine2, String newCity, int newAge) {
	name = newName;
	addressLine1 = newAddressLine1;
	addressLine2 = newAddressLine2;
	city = newCity;
	age = newAge;
    }
    
    public void setName (String newName){
	name = newName;
    }
	
    public void setAddressLine1 (String newAddressLine1){
	addressLine1 = newAddressLine1;
    }
	
    public void setAddressLine2 (String newAddressLine2) {
	addressLine2 = newAddressLine2;
    }
    
    public void setCity (String newCity) {
	city = newCity;
    }
    
    public void setAge (int newAge) {
	age = newAge;
    }
	
    public String getName (){
	return name;
    }
    
    public String getAddressLine1 (){
	return addressLine1;
    }
    
    public String getAddressLine2 (){
	return addressLine2;
    }
    
    public String getCity (){
	return city;
    }
    
    public int getAge (){
	return age;
    }
    
    public String toString(){
        String str = 
            "Nama      : "+ name + "\n"+
            "Alamat 1  : "+ addressLine1 + "\n"+
            "Alamat 2  : "+ addressLine2 + "\n"+
            "Kota      : "+city + "\n"+
            "Umur      : "+age + "\n";
        return str;
    }
    
    static void test(){
        PersonToy t = new PersonToy("Bambang Hariyanto","Jalan Setiabudi 194","Ledeng","Bandung",30);
	
        System.out.println("Bambang Hariyanto sebagai Person:");
        System.out.println(t.getName());
        System.out.println(t.getAddressLine1());
        System.out.println(t.getAddressLine2());
        System.out.println(t.getCity());
        System.out.println(t.getAge());
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
}
