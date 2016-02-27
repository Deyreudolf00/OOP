/*
 * ReflectionBToy.java
 *
 * Created on May 26, 2003, 7:05 AM
 */

package bigToy;
import java.lang.reflect.*;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 230
 */
public class ReflectionBToy {
    
    /** Creates a new instance of ReflectionBToy */
    public ReflectionBToy() {
    }
    
   public static void main (String args[]) {
      String name;
      if (args.length >0) name = args[0];
      else name = JOptionPane.showInputDialog("Class name (misalnya java.lang.Double) :");

      try {
         Class cl = Class.forName(name);
         Class supercl = cl.getSuperclass();
         System.out.println("Class : "+name);
         if(supercl != null && supercl != Object.class)
            System.out.print(" extends " + supercl.getName());

         System.out.print("\n{\n");
         printConstructors(cl);
         System.out.println();
         printMethods(cl);
         System.out.println();
         printFields(cl);
         System.out.println("}");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }

   /**
     Print all constructors of a class
     @param cl a class
   */

   public static void printConstructors(Class cl) {
      Constructor constructors[] = cl.getDeclaredConstructors();

      for (int i=0;i<constructors.length; i++) {
         Constructor c = constructors[i];
         String name = c.getName();
         System.out.print(Modifier.toString(c.getModifiers()));
         System.out.print("   " + name + ")");

         Class paramTypes[] = c.getParameterTypes();
         for (int j=0;j<paramTypes.length;j++) {
            if (j>0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
   Print all methods of a class
   @param cl a class
   */
   public static void printMethods(Class cl) {
      Method methods[] = cl.getDeclaredMethods();
      for(int i=0;i<methods.length;i++) {
         Method m = methods[i];
         Class retType = m.getReturnType();
         String name = m.getName();

         System.out.print(Modifier.toString(m.getModifiers()));
         System.out.print("    "+retType.getName()+"  "+name + "(");

         Class paramTypes[] = m.getParameterTypes();
         for (int j=0;j<paramTypes.length;j++) {
            if(j>0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
   Print all fields of a class
   @param cl a class
   */

   public static void printFields(Class cl) {
      Field fields[] = cl.getDeclaredFields();
      for(int i=0;i<fields.length;i++) {
         Field f = fields[i];
         Class type = f.getType();
         String name = f.getName();
         System.out.print(Modifier.toString(f.getModifiers()));
         System.out.println("   "+type.getName() + "  "+name+ ";");
      }
   }
}
