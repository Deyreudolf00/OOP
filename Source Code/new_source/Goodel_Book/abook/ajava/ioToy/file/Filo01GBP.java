/*
 * Filo01GBP.java
 *
 * Created on January 25, 2004, 10:12 AM
 */

package abook.ajava.ioToy.file;
import java.io.*;
import java.util.Date;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */

public class Filo01GBP {

    static void test01() {
        // Menciptakan objek yang merupakan Direktori
        File aDir = new File("H:/jdk1.4/demo/jfc/Notepad/src");
        System.out.println(aDir+(aDir.isDirectory() ? " adalah " : " adalah bukan ") +"direktori");
    }
    
    static void test02() {
        // Menciptakan objek yang merupakan Direktori
        File aDir = new File("H:/jdk1.4/demo/jfc/Notepad/src");
        
        // Menciptakan objek yang merupakan File
        File aFile = new File(aDir, "Notepad.java");
        System.out.println(aFile + (aFile.exists()?" ada":" tidak ada"));
        System.out.println("Atribut : " + (aFile.canRead()? " dapat dibaca":" tidak dapat dibaca"));
        System.out.println("Atribut : " + (aFile.canWrite()? " dapat ditulis":" tidak dapat ditulis"));
    }
    
    static void test03() {
        // Menciptakan objek yang merupakan Direktori
        File aDir = new File("H:/jdk1.4/demo/jfc/Notepad/src");

        // Absolute path
        System.out.println(aDir.getAbsolutePath() + (aDir.isDirectory() ? " adalah " : " adalah bukan ") +"direktori");
        System.out.println("Induk dari "+aDir.getName()+" adalah "+aDir.getParent());
    }
    
    static void test04() {
        // Menciptakan objek yang merupakan Direktori
        File aDir = new File("H:/jdk1.4/demo/jfc/Notepad/src");
        
        // Mengambil isi direktori
        File[] contents = aDir.listFiles();
        
        // Menampilkan isi direktori
        if (contents!=null) {
            System.out.println("");
            System.out.println(contents.length +" item di direktori "+aDir.getName()+" adalah");
            for(int i=0;i<contents.length;i++){
                System.out.println(contents[i]+" adalah "+(contents[i].isDirectory()?"direktori":"file")+" modifikasi terakhir "+new Date(contents[i].lastModified()));
            }
        } else {
            System.out.println(aDir.getName()+" bukan direktori");
        }
    }
    
    static void test05() {
        // Dengan filtering
        // Menciptakan objek yang merupakan Direktori
        File aDir = new File("H:/jdk1.4/demo/jfc/Notepad/src");
        
        // Mendefinisikan filter
        FilenameFilter filter = new FileListFilter("N","java");
        
        // Mengambil isi direktori
        File[] contents = aDir.listFiles(filter);
        
        // Menampilkan isi direktori
        if (contents!=null) {
            System.out.println("");
            System.out.println(contents.length +" item di direktori "+aDir.getName()+" adalah");
            for(int i=0;i<contents.length;i++){
                System.out.println(contents[i]+" adalah "+(contents[i].isDirectory()?"direktori":"file")+" modifikasi terakhir "+new Date(contents[i].lastModified()));
            }
        } else {
            System.out.println(aDir.getName()+" bukan direktori");
        }
    }
    
    static void test() {
        // test01();
        // test02();
        // test03();
        test04();
        test05();
    }
    
    public static void main(String[] args) {
        test();
    }
}
