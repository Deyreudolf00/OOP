/*
 * DumpableGraph.java
 *
 * Created on January 26, 2004, 8:58 AM
 */

package abook.ajava.utilToy.graph;
import java.io.*;
import java.util.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class DumpableGraph {
    // Inner class node
    public static class Node {
        private Object obj;
        private List children = new ArrayList();
        
        public Node (Object obj) {
            this.obj = obj;
        }
        
        public void addChild(Node node) {
            children.add(node);
        }
        
        public boolean equals (Object node) {
            return obj.equals(((Node)node).obj);
        }
        
        public int hashCode(){
            return obj.hashCode();
        }
        
        public String toString() {
            return obj.toString();
        }
        
        public void dump() {
            dump("", new HashMap());
        }
        
        private void dump(String prefix, Map seen) {
            System.out.println(prefix+"Node: "+obj+" ["+System.identityHashCode(obj)+"/"+obj.hashCode()+"]");
            if (children.size()==0){
                System.out.println(prefix+" (tidak ada anak)");
            } else {
                if(!seen.containsKey(this)){
                    seen.put(this, null);
                    for(Iterator itr=children.iterator(); itr.hasNext();){
                        Node node = (Node)itr.next();
                        node.dump(prefix+"  ",seen);
                    }
                } else {
                    System.out.println(prefix+" (loop)");
                }
            }
        }
    }

    static public void main(String[] args){
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node a2 = new Node("a");
        Node b2 = new Node("b");
        Node e = new Node("e");
        
        a.addChild(b);
        a.addChild(c);
        c.addChild(d);
        c.addChild(a);
        c.addChild(a2);
        a2.addChild(b2);
        a2.addChild(e);
        
        a.dump();
    }
}
