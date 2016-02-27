/*
 * ArrayToy.java
 *
 * Created on June 5, 2003, 9:11 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ArrayToy {
    public static final int NONE = -1;
    /** Creates a new instance of ArrayToy */
    public ArrayToy() {
    }
    
    // Penyisipan o dilakukan pada posisi ins di a[left..right]
    // dimana left<=ins<=right
    static void insert(Object o, int ins, Object[] a, int left, int right){
        if (left <= ins && ins<=right){
            for(int i=right;i>ins;i--) a[i]=a[i-1];
            a[ins] = o;
        }
    }
    
    static void delete(int del, Object[] a, int left, int right){
        if(left <= del && del<=right){
            for (int i=del+1;i<=right;i++)a[i-1] = a[i];
            a[right]=null;
        }
    }
    
    static int linearSearch(Object target, Object[] a, int left, int right){
        for (int p=left;p<=right;p++) 
            if(target.equals(a[p])) return p;
        return NONE;
    }
    
    static int linearSearch(Comparable target, Comparable[] a, int left, int right){
        for(int p=left;p<=right;p++){
            int comp=target.compareTo(a[p]);
            if (comp==0) return p;
            else if(comp<0) return NONE;
        }
        return NONE;
    }
    
    static int binarySearch(Comparable target, Comparable[] a, int left, int right){
        int l=left;
        int r=right;
        
        while (l<=r){
            int m=(l+r)/2;
            int comp=target.compareTo(a[m]);
            if (comp==0) return m;
            else if (comp<0){
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return NONE;
    }
    
    static void merge(
        Comparable[] a1, int left1, int right1,
        Comparable[] a2, int left2, int right2,
        Comparable[] a3, int left3){
        
        int i=left1;
        int j=left2;
        int k=left3;
            
        while (i<=right1 && j<=right2){
            int comp=a1[i].compareTo(a2[j]);
            if(comp <= 0) a3[k++] = a1[i++];
            else a3[k++] = a2[j++];
        }
        while(i <= right1) a3[k++] = a1[i++];
        while(j <= right2) a3[k++] = a2[j++];
    }
    
    static void mergeSort(Comparable[] a, int left, int right){
        Comparable[] b = new Comparable[right-left+1];
        doMergeSort(a, left, right, b);
    }
    
    static void doMergeSort(Comparable[] a, int left, int right, Comparable[] b){
        if (left < right){
            int m=(left+right)/2;
            doMergeSort(a, left, m, b);
            doMergeSort(a, m+1,right,b);
            merge(a, left, m, a, m+1,right,b,0);
            for(int k=left;k<=right;k++) a[k] = b[k-left];
        }
    }
    
    static void test(){
    }
    
    public static void main(String[] args){
        test();
    }
}
