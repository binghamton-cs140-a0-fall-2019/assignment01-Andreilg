package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
    public static void main(String[] args) {
        //In the main method make 2 objects, one with an empty String for address2 and print them
        // to see that one object prints with 3 lines and the other with 2 lines.
        StreetUSAddress usAddress1 = new StreetUSAddress("63-21 Alderton St", "", "Queens", "NY", "11374");
        System.out.println(usAddress1);
        StreetUSAddress usAddress2 = new StreetUSAddress("22 Conklin Ave", "#2FW", "Binghamton", "NY", "13903");
        System.out.println(usAddress2);

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR StreetUSAddress.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            StreetUSAddress usAddress12 = new StreetUSAddress("63-21 Alderton St", "", "Queens", "NY", "11374");
            output.println(usAddress12);
            StreetUSAddress usAddress22 = new StreetUSAddress("22 Conklin Ave", "#2FW", "Binghamton", "NY", "13903");
            output.println(usAddress22);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
