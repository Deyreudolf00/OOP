/*
 * ArrayGrowBToy.java
 *
 * Created on May 26, 2003, 7:00 AM
 */

package abook.misc.bigToy;
import java.lang.reflect.*;
import java.util.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 241
 */
public class ArrayGrowBToy {
    
    /** Creates a new instance of ArrayGrowBToy */
    public ArrayGrowBToy() {
    }
    
   public static void main (String args[]) {
      int a[] = {1, 2, 3 };
      a = (int[]) goodArrayGrow(a);
      arrayPrint(a);

      String b[] = {"Tom", "Dick", "Harry"};
      b = (String[])goodArrayGrow(b);
      arrayPrint(b);

   }

   public Object[] badArrayGrow(Object[] a) {
      int newLength = a.length * 11 /10 + 10;
      Object[] newArray = new Object[newLength];
      System.arraycopy(a, 0, newArray, 0, a.length);

      return newArray;
   }

   static Object goodArrayGrow(Object a) {
      Class cl = a.getClass();
      if (!cl.isArray()) return null;
      Class componentType = cl.getComponentType();
      int length = Array.getLength(a);
      int newLength = length * 11 / 10 + 10;
      Object newArray = Array.newInstance(componentType, newLength);
      System.arraycopy(a, 0, newArray, 0, length);
      return newArray;
   }

   static void arrayPrint(Object a) {
      Class cl = a.getClass();
      if (!cl.isArray()) return;
      Class componentType = cl.getComponentType();
      int length = Array.getLength(a);
      System.out.print(componentType.getName()+"["+length+"] = { ");
      for (int i=0;i<Array.getLength(a);i++)
         System.out.print(Array.get(a,i)+ " ");
      System.out.println("}");
   }
}

