/*
 * ObjectAnalyzerBToy.java
 *
 * Created on May 26, 2003, 7:03 AM
 */

package bigToy;
import java.lang.reflect.*;
import java.util.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 236
 */

public class ObjectAnalyzerBToy {
    
    /** Creates a new instance of ObjectAnalyzerBToy */
    public ObjectAnalyzerBToy() {
    }
    
   public static void main (String args[]) {
      EmployeeClass anEmployee = new EmployeeClass ("Budi Nuriyana", 35000, 1996, 12, 1);
      System.out.println("Budi = "+anEmployee);

      EmployeeClass coder = new EmployeeClass ("Budi Nuriyana", 35000, 1996, 12, 1);
      System.out.println("Sebelum menaikkan gaji, anEmployee.equals(coder) returns "
         + anEmployee.equals(coder));
      anEmployee.raiseSalary(5);
      System.out.println("Setelah menaikkan gaji, anEmployee.equals(coder) returns "
         + anEmployee.equals(coder));

      ManagerClass aManager = new ManagerClass("Bambang Hariyanto",80000,1987,12,15);
      ManagerClass boss = new ManagerClass("Bambang Hariyanto", 80000, 1987,12,15);
      boss.setBonus(5000);
      System.out.println("boss="+boss);
      System.out.println("aManager.equals(boss) returns "+aManager.equals(boss));
   }
}

class ObjectAnalyzer {
   public String toString(Object obj) {
      Class cl = obj.getClass();
      String r = cl.getName();

      do {
         r += "[";
         Field fields[] = cl.getDeclaredFields();
         for (int i=0;i<fields.length;i++) {
            Field f = fields[i];
            r += f.getName() + "=";
            try {
               Object val = f.get(obj);
               r += val.toString();
            } catch (Exception e) {
               e.printStackTrace();
            }
            r += ",";
         }
         r += "]";
         cl = cl.getSuperclass();
      } while (cl != Object.class);
      return r;
   }

   public static boolean equals(Object a, Object b) {
      if (a==b) return true;
      if (a == null || b == null) return false;
      Class cl = a.getClass();
      if (cl != b.getClass()) return false;

      do {
          Field fields[] = cl.getDeclaredFields();
          AccessibleObject.setAccessible(fields, true);
          for (int i=0;i<fields.length;i++) {
             Field f = fields[i];
             try {
                if (!f.get(a).equals(f.get(b)))
                   return false;
             } catch (Exception e) {
                e.printStackTrace();
             }
             cl = cl.getSuperclass();
          }
      } while (cl != Object.class);
      return true;
   }
}

class EmployeeClass {
   private String name;
   private double salary;
   private Date hireDay;

   public EmployeeClass(String n, double s, int year, int month, int day) {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month-1,day);
      hireDay = calendar.getTime();
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public Date getHireDay() {
      return hireDay;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public String toString () {
      return ObjectAnalyzer.toString(this);
   }

   public boolean equals(this, b) {
      return ObjectAnalyzer.equals(this, b);
   }
}

class ManagerClass extends EmployeeClass {
   private double bonus;
   public Manager(String n, double s, int year, int month, int day) {
      super(n, s, year, month, day);
      bonus = 0;
   }

   public void setBonus(double b) {
      bonus = b;
   }
}
