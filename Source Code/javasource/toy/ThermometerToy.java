/*
 * ThermometerToy.java
 *
 * Created on May 25, 2003, 5:58 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 *   Date        : March 1, 2002
 *   Description : Thermometer Class
 *		  The first version: without invalid value handling
 *		  
 *   Approved by  : 
 *   Tested by    :
 *   Modification :    
 */

public class ThermometerToy {
    
    private double valueInCelcius;
    
    /** Creates a new instance of ThermometerToy */
    public ThermometerToy() {
    }
    
    public ThermometerToy (double newValueInCelcius) {
	valueInCelcius = newValueInCelcius;
    }
    
    // Accessing operations
    public void setInCelcius (double newValue) {
	valueInCelcius = newValue;
    }
    
    public void setInReamur (double newValue) {
	valueInCelcius = (5/4) * newValue;
    }
    
    public void setInFahrenheit (double newValue) {
	valueInCelcius = (5/9) * (newValue - 32);
    }
    
    public void setInKelvin (double newValue) {
	valueInCelcius = newValue - 272;
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
        ThermometerToy t = new ThermometerToy(0.0);
        
	System.out.println("Pengujian");
	System.out.println("Aplikasi Thermometer");
	System.out.println("Nilai Celcius Yang Dimasukkan adalah 50");
	
	
	System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	System.out.println("Nilai di Reamur     : "+t.getInReamur());
	System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	System.out.println("Nilai di Kelvin     : "+t.getInKelvin());

	t.setInCelcius(50.0);
	
	System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	System.out.println("Nilai di Reamur     : "+t.getInReamur());
	System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	System.out.println("Nilai di Kelvin     : "+t.getInKelvin());


	t.setInCelcius(100.0);
	
	System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	System.out.println("Nilai di Reamur     : "+t.getInReamur());
	System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	System.out.println("Nilai di Kelvin     : "+t.getInKelvin());
    }
    
    static public void main (String[] args){
        test();
    }
}
