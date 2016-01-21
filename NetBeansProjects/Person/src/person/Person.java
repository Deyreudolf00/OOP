/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author rengga
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    String nama;
    String alamat1;
    String alamat2;
    String kota;
    int umur;
    
    public Person()
    {
        nama = "";
        alamat1 = "";
        alamat2 = "";
        kota = "";
        umur= 0;
    }
    public Person(String newNama, String newAlamat1, String newAlamat2, String newKota, int newUmur)
    {
        nama = newNama;
        alamat1 = newAlamat1;
        alamat2 = newAlamat2;
        kota = newKota;
        umur = newUmur;
    }
    public void setNama(String newNama)
    {
        nama = newNama;
    }
    public void setAlamat1(String newAlamat1)
    {
        alamat1=newAlamat1;
    }
    public void setAlamat2(String newAlamat2)
    {
        alamat1=newAlamat2;
    }
    public void setKota(String newKota)
    {
        kota= newKota;
    }
    public String getNama()
    {
        return nama;
    }
    public String getAlamat1()
    {
        return alamat1;
    }
     public String getAlamat2()
    {
        return alamat2;
    }
    public String getKota()
     {
         return kota;
     }
    public int getUmur()
    {
         return umur;
     }
    public String toString()
     {
         String str =
                 "Nama      : "+nama+"\n"+
                 "Alamat1   : "+alamat1+"\n"+
                 "Alamat2   : "+alamat2+"\n"+
                 "Kota      : "+kota+"\n"+
                 "Umur      : " +umur+ "\n";
                 return str;
     }
    static void test()
     {
         Person p = new Person("Yolo","Jalan jalan","Jalan Lagi","Semarang",20);
         System.out.println(p.getNama());
         System.out.println(p.getAlamat1());
         System.out.println(p.getAlamat2());
         System.out.println(p.getKota());
         System.out.println(p.getUmur());
     }
    public static void main(String[] args) {
        // TODO code application logic here
        test();
    }
    
}
