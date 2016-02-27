/*
 * WaterToy.java
 *
 * Created on June 8, 2003, 11:52 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class WaterToy {
    private double temperature;
    
    /** Creates a new instance of WaterToy */
    public WaterToy(double temperature) {
        this.temperature = temperature;
    }
    
    public String getForm(){
        if(temperature < 0) return "Es - beku";
        if(temperature == 0) return "Transisi Es dan Air";
        if(temperature >0 && temperature <100) return "Air - cair";
        if(temperature == 100) return "Transisi Cair dan Uap";
        if(temperature > 100) return "Uap - gas";
        return "";
    }
    
    public String getWorseForm(){
        // Bila tanpa fasilitas return seperti pada Pascal
        String str="";
        if(temperature < 0) str = "Es - beku";
        else if(temperature == 0) str = "Transisi Es dan Air";
        else if(temperature >0 && temperature <100) str = "Air - cair";
        else if(temperature == 100) str = "Transisi Cair dan Uap";
        else if(temperature > 100) str = "Uap - gas";
        return str;
    }

    public String getWorstForm(){
        // Bila tanpa fasilitas return dan else if seperti pada Pascal
        String str="";
        if(temperature < 0) {
            str = "Es - beku";
        } else {
            if(temperature == 0) {
                str = "Transisi Es dan Air";
            } else {
                if(temperature >0 && temperature <100) {
                    str = "Air - cair";
                } else {
                    if(temperature == 100) {
                        str = "Transisi Cair dan Uap";
                    } else {
                        if(temperature > 100) {
                            str = "Uap - gas";
                        }
                    }
                }
             }
        }
        return str;
    }
    
    public String toString(){
        String str = 
         "Air bersuhu : "+temperature+"\n"+
         "Berbentuk   : "+getForm();
        return str;
    }
    
    public String toWorseString(){
        String str = 
         "Air bersuhu : "+temperature+"\n"+
         "Berbentuk   : "+getWorseForm();
        return str;
    }

    public String toWorstString(){
        String str = 
         "Air bersuhu : "+temperature+"\n"+
         "Berbentuk   : "+getWorstForm();
        return str;
    }

    static void test01(){
        System.out.println(new WaterToy(-10));
        System.out.println(new WaterToy(0));
        System.out.println(new WaterToy(10));
        System.out.println(new WaterToy(100));
        System.out.println(new WaterToy(110));
    }
    
    static void test02(){
        WaterToy t = new WaterToy(-10);
        System.out.println(t.toWorseString());
    }

    static void test03(){
        WaterToy t = new WaterToy(-10);
        System.out.println(t.toWorstString());
    }
    
    static void test(){
        test01();
        test02();
        test03();
    }

    public static void main(String[] args){
        test();
    }
}
