/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massa;

/**
 *
 * @author rengga
 */
public class Massa {
    
    private String nama = "";
    private double density = 0;
    
    public Massa()
    {
        
    }
    public Massa (String nama, double density)
    {
        this.nama=nama;
        this.density=density;
    }
    public double getMassa(double volume)
    {
        return density*volume;
    }
    public double getDensity()
    {
        return density;
    }
    public double getVolume(double massa)
    {
        return massa/density;
    }
    public String toString()
    {
        String str = "Benda"+"\n"+"Nama Benda = "+nama+"\n"+"Massa jenis = "+density+"\n";
        return str;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Massa mas = new Massa("Aluminium", 2.7);
        System.out.println(mas);
        mas.getVolume(200.99);
        mas.getMassa(300.88);
        mas.getDensity();
        mas.toString();
        
    }
    
}
