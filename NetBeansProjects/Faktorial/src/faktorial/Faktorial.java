/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

/**
 *
 * @author rengga
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    private  int number = 0;
    public Faktorial()
    {
        
    }
    public Faktorial(int number)
    {
        this.number=number;
    }
    public void setNumber(int number)
    {
        this.number=number;
    }
    public int getNumber()
    {
        return number;
    }
    public long calc(int n)
    {
        if(n>1)
        {
            return (n*calc(n-1));
        }
        else
        {
            return 1;
        }
    }
    public long get()
    {
        return calc(number);
    }
    static void test()
    {
        Faktorial f = new Faktorial();
        for(int i=0;i<21;i++)
        {
            f.setNumber(i);
            System.out.println("Faktorial dari "+i+" adalah "+f.get());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        test();
    }
}
