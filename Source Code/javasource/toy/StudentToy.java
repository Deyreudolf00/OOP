/*
 * StudentToy.java
 *
 * Created on May 26, 2003, 3:31 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class StudentToy extends PersonToy {
    String nrp;
    String strata;
    String department;
    
    /** Creates a new instance of StudentToy */
    public StudentToy() {
	super();
	nrp = "";
	strata = "";
	department = "";
    }
    
    public StudentToy (String newName, String newAddressLine1, String newAddressLine2, String newCity, int newAge, String newNrp, String newStrata, String newDepartment) {
	super(newName, newAddressLine1, newAddressLine2, newCity, newAge);
	nrp = newNrp;
	strata = newStrata;
	department = newDepartment;
    }
    
    public void setNrp (String newNrp) {
	nrp = newNrp;
    }
    
    public String getNrp () {
	return nrp;
    }
    
    public void setStrata (String newStrata) {
	strata = newStrata;
    }
    
    public String getStrata () {
	return strata;
    }
    
    public void setDepartment (String newDepartment) {
	department = newDepartment;
    }
    
    public String getDepartment () {
	return department;
    }
    
    
    public String toString(){
        String str = 
            "Nama      : "+ name + "\n"+
            "Alamat 1  : "+ addressLine1 + "\n"+
            "Alamat 2  : "+ addressLine2 + "\n"+
            "Kota      : "+city + "\n"+
            "Umur      : "+age + "\n"+
            "NRP       : "+nrp + "\n"+
            "Strata    : "+strata + "\n"+
            "Jurusan   : "+department;
        return str;
    }
    
    static void test(){
        StudentToy t = new StudentToy ("Bambang Hariyanto","Jalan Setiabudi 194","Ledeng","Bandung",30,"2973535","Strata 2","Teknik Informatika");

        System.out.println("Bambang Hariyanto sebagai Student:");
        System.out.println(t.getName());
        System.out.println(t.getAddressLine1());
        System.out.println(t.getAddressLine2());
        System.out.println(t.getCity());
        System.out.println(t.getAge());
        System.out.println(t.getNrp());
        System.out.println(t.getStrata());
        System.out.println(t.getDepartment());
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
}
