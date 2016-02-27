/*
 * DepartmentToy.java
 *
 * Created on May 26, 2003, 3:51 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DepartmentToy {
    String name;
    String headMaster;
    
    /** Creates a new instance of DepartmentToy */
    public DepartmentToy() {
        name = "";
        headMaster = "";
    }

    public DepartmentToy (String newName, String newHeadMaster) {
	name = newName;
	headMaster = newHeadMaster;
    }
    
    public void setName (String newName) {
	name =  newName;
    }
    
    public void setHeadMaster(String newHeadMaster) {
	headMaster = newHeadMaster;
    }
    
    public String getName () {
	return name;
    }
    
    public String getHeadMaster () {
	return headMaster;
    }
    
    public String toString(){
        String str = 
            "Nama Jurusan  : "+name+"\n"+
            "Ketua Jurusan : "+headMaster+"\n";
        return str;
    }
    
    static void test(){
        DepartmentToy t = new DepartmentToy("Teknik Informatika","Mr X");
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
}
