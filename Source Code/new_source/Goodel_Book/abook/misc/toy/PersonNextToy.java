/*
 * Class.java
 *
 * Created on June 5, 2003, 6:59 PM
 */

package abook.misc.toy;
import colToy.SLListToy;
import colToy.SLLNode;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PersonNextToy {
    
    /** Creates a new instance of Class */
    public PersonNextToy(String name, int age) {
        this.name = name;
        this.age = age;
        address = new SLListToy();
    }
    
    public String toString(){
        String str = 
            "Nama   : "+name+"\n"+address;
        return str;
    }
    
    static void test(){
        PersonNextToy t = new PersonNextToy("Bambang Hariyanto",20);
        AddressToy a = new AddressToy("Jalan Siliwangi 25","Bandung","4000");
        AddressToy b = new AddressToy("Jalan Siliwangi 26","Bandung","4000");
        AddressToy c = new AddressToy("Jalan Siliwangi 27","Bandung","4000");
        AddressToy d = new AddressToy("Jalan Siliwangi 28","Bandung","4000");
        AddressToy e = new AddressToy("Jalan Siliwangi 29","Bandung","4000");
        
        SLLNode na = new SLLNode(a,null);
        SLLNode nb = new SLLNode(b,null);
        SLLNode nc = new SLLNode(c,null);
        SLLNode nd = new SLLNode(d,null);
        SLLNode ne = new SLLNode(e,null);

        t.address.insertLast(na);
        t.address.insertLast(nb);
        t.address.insertLast(nc);
        t.address.insertLast(nd);
        t.address.insertLast(ne);

        System.out.println(t);
    }
    
    public static void main (String[] args){
        test();
    }
}

