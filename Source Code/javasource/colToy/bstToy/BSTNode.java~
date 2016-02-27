/*
 * BSTNode.java
 * Binary Search Tree Node
 * Created on June 6, 2003, 12:49 AM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class BSTNode {
    protected Comparable c;
    protected BSTNode lchild;
    protected BSTNode rchild;
    protected BSTNode parent;
    /** Creates a new instance of BSTNode */
    public BSTNode(Comparable c) {
        this.c = c;
        this.lchild = null;
        this.rchild = null;
    }
    
    public BSTNode(Comparable c, BSTNode lchild, BSTNode rchild){
        this.c = c;
        this.lchild = lchild;
        this.rchild = rchild;
    }
    
    public Comparable getObject(){
        return c;
    }
    
    public String toString(){
        return c.toString();
    }
    
    static void test(){
        BSTNode n = new BSTNode(new Integer(15),null,null);
        System.out.println("Node adalah "+n);
    }
    
    public static void main(String[] args){
        test();
    }
}
