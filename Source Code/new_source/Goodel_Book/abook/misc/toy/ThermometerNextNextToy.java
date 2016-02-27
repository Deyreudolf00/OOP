/*
 * ThermometerSmartToy.java
 *
 * Created on May 25, 2003, 6:12 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
		  with Structured Exception Handling
 */

 public class ThermometerNextNextToy {
     private double valueInCelcius;
   
    /** Creates a new instance of ThermometerSmartToy */
     public ThermometerNextNextToy() {
	valueInCelcius = 0;
    }
    
     public ThermometerNextNextToy(double newValue) throws Exception{
	valueInCelcius = newValue;
	if (valueInCelcius < -272.0) {
	    Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
	    throw (E);
	}
    }
    
    // Accessing operations
    public void setInCelcius (double newValue) throws Exception{
	valueInCelcius = newValue;
	if (valueInCelcius < -272.0) {
	    Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
	    throw (E);
	}
    }
    
    public void setInReamur (double newValue) throws Exception{
	valueInCelcius = (5/4) * newValue;
	if (valueInCelcius < -272.0) {
	    Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
	    throw (E);
	}
    }
    
    public void setInFahrenheit (double newValue) throws Exception {
	valueInCelcius = (5/9) * (newValue - 32);
	if (valueInCelcius < -272.0) {
	    Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
	    throw (E);
	}
    }
    
    public void setInKelvin (double newValue) throws Exception {
	valueInCelcius = newValue - 272;
	if (valueInCelcius < -272.0) {
	    Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
	    throw (E);
	}
    }
    
    public double getInCelcius () {
	return valueInCelcius;
    }
    
    public double getInReamur () {
	return ((4/5) * valueInCelcius);
    }
    
    public double getInFahrenheit () {
	return (((9/5) * valueInCelcius) + 32);
    }
    
    public double getInKelvin () {
	return (valueInCelcius + 272);
    }
    
    static void test(){
        ThermometerNextToy t;
        
	System.out.println("Pengujian");
	System.out.println("Aplikasi Thermometer");
	System.out.println("Nilai Celcius Yang Dimasukkan adalah 50");
	System.out.println("Dengan Penanganan Kondisi Pemasukan Nilai Tak Absah");
	System.out.println("Memanfaatkan Structured Exception Handling");
	System.out.println("===================================================");
	
	try {
            t = new ThermometerNextToy(0.0);
	    
	    System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	    System.out.println("Nilai di Reamur     : "+t.getInReamur());
	    System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	    System.out.println("Nilai di Kelvin     : "+t.getInKelvin());

	    try {
		t.setInCelcius(50.0);
		
		System.out.println("Nilai di Celcius    : "+t.getInCelcius());
		System.out.println("Nilai di Reamur     : "+t.getInReamur());
		System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
		System.out.println("Nilai di Kelvin     : "+t.getInKelvin());

	    } catch (Exception e) {
		System.out.println ("Exception : " + e.getMessage());
	    }

	    try {
		t.setInCelcius(-273.0);
		
		System.out.println("Nilai di Celcius    : "+t.getInCelcius());
		System.out.println("Nilai di Reamur     : "+t.getInReamur());
		System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
		System.out.println("Nilai di Kelvin     : "+t.getInKelvin());
	    } catch (Exception e) {
		System.out.println ("Exception : " + e.getMessage());
	    }
	} catch (Exception e) {
	    System.out.println ("Exception : " + e.getMessage());
	}
    }
    
    public static void main(String[] args){
        test();
    }
}
