package toy;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Data structures and program design in Pascal
 *  Larry Nyhoff - Sanford Leestma, page 76
 *  Exersize 20
 */

/*
 * MagicNumberToy.java
 *
 * Created on May 18, 2003, 7:33 AM
 */

public class MagicNumberToy {
    static final int ADJUST = 1;
    
    private int side;
    private int[][] square;
    
    private boolean fValid = false;
    
    
    /** Creates a new instance of MagicNumberToy */
    public MagicNumberToy(int side) {
        if (side % 2 == 1) {
            this.fValid = true;
            this.side = side;
            square = new int[side][side];
            makeMagic();
        }
    }
    
    static void test01(){
        MagicNumberToy t = new MagicNumberToy(5);
        if (t.isValid()) t.printSquare();
        else System.out.println("Nilai sisi yang dimasukkan tidak sah!");
        System.out.println("");
    }
    
    static void test02(){
        MagicNumberToy t = new MagicNumberToy(5);
        if (t.isValid()) System.out.println(t);
        else System.out.println("Nilai sisi yang dimasukkan tidak sah!");
        System.out.println("");
    }
    
    static void test03(){
        MagicNumberToy t = new MagicNumberToy(6);
        if (t.isValid()) t.printSquare();
        else System.out.println("Nilai sisi yang dimasukkan tidak sah!");
        System.out.println("");
    }

    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }
    
    public boolean isValid(){
        return fValid;
    }
    
    private void makeMagic() {
        // Precondition : side % 2 == 1
        int row = 1-ADJUST;
        int col = side/2;
        square[row][col] = 1;
        for (int k=2;k<=(side*side);k++) {
            int oldRow = row;
            int oldCol = col;
            
            row = row - 1;
            col = col + 1;
            
            if (row < 0) row = side-ADJUST;
            if (col >side-ADJUST) col = 1-ADJUST;
            if (square[row][col] == 0) square[row][col] = k;
            else {
                row = oldRow + 1;
                col = oldCol;
                square[row][col] = k;
            }
        }
    }
    
    public void printSquare() {
        // Precondition : isValid() == true
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++) {
                //if (square[i][j] <10) 
                //    System.out.print(" ");
                System.out.print(square[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public String toString() {
        // Precondition : isValid() == true
        String str = "";
        
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++) {
                str += square[i][j]+"\t";
            }
            str += "\n";
        }
        return str;
    }
}
