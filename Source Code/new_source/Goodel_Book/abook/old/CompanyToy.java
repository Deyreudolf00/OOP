/*
 * CompanyToy.java
 *
 * Created on June 1, 2003, 8:00 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

interface Company {   
    //Variabel berikut adalah static dan final.   
    static final String PROVINCE = "JAWA BARAT";   
    
    // Secara default, variable berikut static dan final, meski tidak dinyatakan   
    // secara eksplisit      
    String COUNTRY = "INDONESIA";   
    
    public void setName(String newName);   
    public void setAddress(String newAddress);   
    public void setPhone(String newPhone);   
    public String getName();   
    public String getAddress();   
    public String getPhone();
}

class ShoeCompany implements Company {   
    String name, address, phone;   
    public ShoeCompany(String newName, String newAddress, String newPhone)   {      
        name = newName;      
        address = newAddress;      
        phone = newPhone;   
    }   
    
    public void setName(String newName)   {      
        name = newName;   
    }   
    
    public void setAddress(String newAddress)   {      
        address = newAddress;   
    }   
    
    public void setPhone(String newPhone)   {      
        phone = newPhone;   
    }   
    
    public String getName()   {      
        return name;   
    }   
    
    public String getAddress()   {      
        return address;   
    }   
    
    public String getPhone()   {      
        return phone;   
    }   
    
    public String getProvince()   {      
        return PROVINCE;   
    }   
    
    public String getCountry()   {      
        return COUNTRY;   
    }   
    
    public String toString()   {      
        return 
            "name     : " + name + "\n" + 
            "address  : " + address + "\n" + 
            "phone    : " + phone + "\n" +             
            "province : " + PROVINCE + "\n" +             
            "country  : " + COUNTRY;   
    }
}

public class CompanyToy {
    
    /** Creates a new instance of CompanyToy */
    public CompanyToy() {
    }
    
    public static void main (String args[])   {      
        test();
    }   
    
    static void test(){
        ShoeCompany ShoeSupplier;      
        ShoeSupplier = new ShoeCompany("Biru Shoe","Jalan Pajajaran 2","999878");
        System.out.println("Informasi perusahaan : " + "\n"+ShoeSupplier);   
    }
}
