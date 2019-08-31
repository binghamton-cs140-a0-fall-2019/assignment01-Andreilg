package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
    public static void main(String[] args) {
        //Create one person and see that it prints correctly add similar code to print your test to the output file.
        DateAndPlaceOfBirth dobnplace = new DateAndPlaceOfBirth(1993, 6, 24, "Queens", "NY", "USA");
        StreetUSAddress myAddress = new StreetUSAddress("22 Conklin Ave", "#2FW", "Binghamton", "NY", "13903");
        Person me = new Person("Andrei", "Georgescu", "123-45-6789", dobnplace, myAddress);
        System.out.println(me);

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR Person.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            DateAndPlaceOfBirth dobnplace2 = new DateAndPlaceOfBirth(1993, 6, 24, "Queens", "NY", "USA");
            StreetUSAddress myAddress2 = new StreetUSAddress("22 Conklin Ave", "#2FW", "Binghamton", "NY", "13903");
            Person me2 = new Person("Andrei", "Georgescu", "123-45-6789", dobnplace2, myAddress2);
            output.println(me2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
