package abook.ajava.ioToy.cookbook;
 
public class LS {

    public static void main(String argh_my_aching_fingers[]) {

        String[] dir = new java.io.File(".").list( ); // Get list of names

        java.util.Arrays.sort(dir);        // Sort it (see  Recipe 7.8)

        for (int i=0; i<dir.length; i++)

            System.out.println(dir[i]);    // Print the list

    }

}