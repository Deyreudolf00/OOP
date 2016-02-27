/*
 * StudentNextToy.java
 *
 * Created on May 26, 2003, 3:49 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class StudentNextToy extends PersonToy{
    String nrp;
    String strata;
    DepartmentToy department;
    
    /** Creates a new instance of StudentNextToy */
    public StudentNextToy() {
	super();
	nrp = "";
	strata = "";
        department = null;
    };
    
    public StudentNextToy (String newName, String newAddressLine1, String newAddressLine2, String newCity, int newAge, String newNrp, String newStrata, DepartmentToy newDepartment) {
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
    
    public void setDepartment (DepartmentToy newDepartment) {
	department = newDepartment;
    }
    
    public DepartmentToy getDepartment () {
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
            "Jurusan   : ";
        if (getDepartment() != null) str += getDepartment().getName();
        return str;
    }
        
    static void test(){
        DepartmentToy d = new DepartmentToy ("Teknik Informatika","Dr toyMaster,Ir.MT");
        StudentNextToy t = new StudentNextToy ("Bambang Hariyanto","Jalan Setiabudi 194","Ledeng","Bandung",30,"2973535","Strata 2",d);
	
        System.out.println("\n");
        System.out.println("Bambang Hariyanto sebagai Student:");
        System.out.println(t.getName());
        System.out.println(t.getAddressLine1());
        System.out.println(t.getAddressLine2());
        System.out.println(t.getCity());
        System.out.println(t.getAge());
        System.out.println(t.getNrp());
        System.out.println(t.getStrata());
        System.out.println(t.getDepartment().getName());
        System.out.println(t.getDepartment().getHeadMaster());
        
        System.out.println(t);
    }

    public static void main(String[] args) {
        test();
    }
    
}
