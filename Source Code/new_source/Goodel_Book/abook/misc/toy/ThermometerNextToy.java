/*
 * ThermometerNextToy.java
 *
 * Created on May 25, 2003, 6:05 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
    Description : Thermometer
		  Invalid value handling, without Structured Exception Handling
 */

public class ThermometerNextToy {
    
    private double valueInCelcius;
    private boolean b;    
    
    // constructor
    /** Creates a new instance of ThermometerNextToy */
    public ThermometerNextToy() {
	valueInCelcius = 0;
	b = true;
    }
    
    public ThermometerNextToy (double newValueInCelcius) {
	valueInCelcius = newValueInCelcius;
	if (valueInCelcius < -272.0) 
	{
	    b = false;
	} else {
	    b = true;
	}
    }
    
    // Accessing operations
    public boolean isValid() 
    {
	return b;
    }
    
    public void inValidate() 
    {
	b = false;
    }
    
    private void validate() 
    {
	b = true;
    }
    
    public void setInCelcius (double newValue) {
	valueInCelcius = newValue;
	if (valueInCelcius < -272.0) 
	{
	    b = false;
	} else {
	    b = true;
	}
    }
    
    public void setInReamur (double newValue) {
	valueInCelcius = (5/4) * newValue;
	if (valueInCelcius < -272.0) 
	{
	    b = false;
	} else {
	    b = true;
	}
    }
    
    public void setInFahrenheit (double newValue) {
	valueInCelcius = (5/9) * (newValue - 32);
	if (valueInCelcius < -272.0) 
	{
	    b = false;
	} else {
	    b = true;
	}
    }
    
    public void setInKelvin (double newValue) {
	valueInCelcius = newValue - 272;
	if (valueInCelcius < -272.0) 
	{
	    b = false;
	} else {
	    b = true;
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
        ThermometerNextToy t = new ThermometerNextToy(0.0);

        System.out.println("Pengujian");
	System.out.println("Aplikasi Thermometer");
	System.out.println("Dengan Penanganan Kondisi Pemasukan Nilai Tak Absah");
	System.out.println("Tanpa Memanfaatkan Structured Exception Handling");
	System.out.println("===================================================");
	
	System.out.println("Nilai Celcius Yang Dimasukkan adalah 50");
	
	if (t.isValid()) 
	    System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");
	if (t.isValid()) 
	    System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");
	if (t.isValid()) 
	    System.out.println("Nilai di Kelvin     : "+t.getInKelvin());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");


	t.setInCelcius(50.0);
	
	if (t.isValid()) 
	    System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");

	if (t.isValid()) 
	    System.out.println("Nilai di Reamur     : "+t.getInReamur());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");

	if (t.isValid()) 
	    System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");

	if (t.isValid()) 
	    System.out.println("Nilai di Kelvin     : "+t.getInKelvin());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");


	t.setInCelcius(-273.0);
	
	if (t.isValid()) 
	    System.out.println("Nilai di Celcius    : "+t.getInCelcius());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");

	if (t.isValid()) 
	    System.out.println("Nilai di Reamur     : "+t.getInReamur());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");
	    
	if (t.isValid()) 
	    System.out.println("Nilai di Fahrenheit : "+t.getInFahrenheit());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");
	    
	if (t.isValid()) 
	    System.out.println("Nilai di Kelvin     : "+t.getInKelvin());
	else 
	    System.out.println("Nilai di Thermometer tidak absah");
    }
    
    static public void main(String[] args){
        test();
    }
}
