package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
    public static void main(String[] args) {
        //In the main method make 5 DateAndPlaceOfBirth objects 3 with birth places in the USA (with a State)
        // and 2 from other countries using the 2nd constructor that does not have a state parameter.
        // Give two objects the same birth date and have another object with the same birthday (day and month)
        // but a different birth year.
        // Use System.out.println to print each of the 5 objects and then to print the values of the four other
        // methods that are not getter methods, e.g., System.out.println(object1.hasSameBirthDayAs(object2)).
        // You will need many lines to test the 4 methods, we want to see that get the right true and false values
        // for the different combinations of the objects you made.
        DateAndPlaceOfBirth dobnplace1 = new DateAndPlaceOfBirth(1993, 6, 24, "Queens", "NY", "USA");
        System.out.println(dobnplace1);
        DateAndPlaceOfBirth dobnplace2 = new DateAndPlaceOfBirth(1996, 6, 24, "Bronx", "NY", "USA");
        System.out.println(dobnplace2);
        DateAndPlaceOfBirth dobnplace3 = new DateAndPlaceOfBirth(1994, 2, 21, "Miami", "FL", "USA");
        System.out.println(dobnplace3);
        DateAndPlaceOfBirth dobnplace4 = new DateAndPlaceOfBirth(1993, 6, 24, "Bucharest", "Romania");
        System.out.println(dobnplace4);
        DateAndPlaceOfBirth dobnplace5 = new DateAndPlaceOfBirth(1997, 4, 14, "Athens", "Greece");
        System.out.println(dobnplace5);

        System.out.println(dobnplace1.olderThan(dobnplace2));
        System.out.println(dobnplace1.youngerThan(dobnplace2));
        System.out.println(dobnplace1.hasSameBirthDateAs(dobnplace2));
        System.out.println(dobnplace1.hasSameBirthDayAs(dobnplace2));
        System.out.println(dobnplace1.olderThan(dobnplace3));
        System.out.println(dobnplace1.youngerThan(dobnplace3));
        System.out.println(dobnplace1.hasSameBirthDateAs(dobnplace3));
        System.out.println(dobnplace1.hasSameBirthDayAs(dobnplace3));
        System.out.println(dobnplace1.olderThan(dobnplace4));
        System.out.println(dobnplace1.youngerThan(dobnplace4));
        System.out.println(dobnplace1.hasSameBirthDateAs(dobnplace4));
        System.out.println(dobnplace1.hasSameBirthDayAs(dobnplace4));
        System.out.println(dobnplace1.olderThan(dobnplace5));
        System.out.println(dobnplace1.youngerThan(dobnplace5));
        System.out.println(dobnplace1.hasSameBirthDateAs(dobnplace5));
        System.out.println(dobnplace1.hasSameBirthDayAs(dobnplace5));
        System.out.println(dobnplace2.olderThan(dobnplace3));
        System.out.println(dobnplace2.youngerThan(dobnplace3));
        System.out.println(dobnplace2.hasSameBirthDateAs(dobnplace3));
        System.out.println(dobnplace2.hasSameBirthDayAs(dobnplace3));
        System.out.println(dobnplace2.olderThan(dobnplace4));
        System.out.println(dobnplace2.youngerThan(dobnplace4));
        System.out.println(dobnplace2.hasSameBirthDateAs(dobnplace4));
        System.out.println(dobnplace2.hasSameBirthDayAs(dobnplace4));
        System.out.println(dobnplace2.olderThan(dobnplace5));
        System.out.println(dobnplace2.youngerThan(dobnplace5));
        System.out.println(dobnplace2.hasSameBirthDateAs(dobnplace5));
        System.out.println(dobnplace2.hasSameBirthDayAs(dobnplace5));
        System.out.println(dobnplace3.olderThan(dobnplace4));
        System.out.println(dobnplace3.youngerThan(dobnplace4));
        System.out.println(dobnplace3.hasSameBirthDateAs(dobnplace4));
        System.out.println(dobnplace3.hasSameBirthDayAs(dobnplace4));
        System.out.println(dobnplace3.olderThan(dobnplace5));
        System.out.println(dobnplace3.youngerThan(dobnplace5));
        System.out.println(dobnplace3.hasSameBirthDateAs(dobnplace5));
        System.out.println(dobnplace3.hasSameBirthDayAs(dobnplace5));
        System.out.println(dobnplace4.olderThan(dobnplace5));
        System.out.println(dobnplace4.youngerThan(dobnplace5));
        System.out.println(dobnplace4.hasSameBirthDateAs(dobnplace5));
        System.out.println(dobnplace4.hasSameBirthDayAs(dobnplace5));

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            DateAndPlaceOfBirth dobnplace12 = new DateAndPlaceOfBirth(1993, 6, 24, "Queens", "NY", "USA");
            output.println(dobnplace12);
            DateAndPlaceOfBirth dobnplace22 = new DateAndPlaceOfBirth(1996, 6, 24, "Bronx", "NY", "USA");
            output.println(dobnplace22);
            DateAndPlaceOfBirth dobnplace32 = new DateAndPlaceOfBirth(1994, 2, 21, "Miami", "FL", "USA");
            output.println(dobnplace32);
            DateAndPlaceOfBirth dobnplace42 = new DateAndPlaceOfBirth(1993, 6, 24, "Bucharest", "Romania");
            output.println(dobnplace42);
            DateAndPlaceOfBirth dobnplace52 = new DateAndPlaceOfBirth(1997, 4, 14, "Athens", "Greece");
            output.println(dobnplace52);

            output.println(dobnplace12.olderThan(dobnplace22));
            output.println(dobnplace12.youngerThan(dobnplace22));
            output.println(dobnplace12.hasSameBirthDateAs(dobnplace22));
            output.println(dobnplace12.hasSameBirthDayAs(dobnplace22));
            output.println(dobnplace12.olderThan(dobnplace32));
            output.println(dobnplace12.youngerThan(dobnplace32));
            output.println(dobnplace12.hasSameBirthDateAs(dobnplace32));
            output.println(dobnplace12.hasSameBirthDayAs(dobnplace32));
            output.println(dobnplace12.olderThan(dobnplace42));
            output.println(dobnplace12.youngerThan(dobnplace42));
            output.println(dobnplace12.hasSameBirthDateAs(dobnplace42));
            output.println(dobnplace12.hasSameBirthDayAs(dobnplace42));
            output.println(dobnplace12.olderThan(dobnplace52));
            output.println(dobnplace12.youngerThan(dobnplace52));
            output.println(dobnplace12.hasSameBirthDateAs(dobnplace52));
            output.println(dobnplace12.hasSameBirthDayAs(dobnplace52));
            output.println(dobnplace22.olderThan(dobnplace32));
            output.println(dobnplace22.youngerThan(dobnplace32));
            output.println(dobnplace22.hasSameBirthDateAs(dobnplace32));
            output.println(dobnplace22.hasSameBirthDayAs(dobnplace32));
            output.println(dobnplace22.olderThan(dobnplace42));
            output.println(dobnplace22.youngerThan(dobnplace42));
            output.println(dobnplace22.hasSameBirthDateAs(dobnplace42));
            output.println(dobnplace22.hasSameBirthDayAs(dobnplace42));
            output.println(dobnplace22.olderThan(dobnplace52));
            output.println(dobnplace22.youngerThan(dobnplace52));
            output.println(dobnplace22.hasSameBirthDateAs(dobnplace52));
            output.println(dobnplace22.hasSameBirthDayAs(dobnplace52));
            output.println(dobnplace32.olderThan(dobnplace42));
            output.println(dobnplace32.youngerThan(dobnplace42));
            output.println(dobnplace32.hasSameBirthDateAs(dobnplace42));
            output.println(dobnplace32.hasSameBirthDayAs(dobnplace42));
            output.println(dobnplace32.olderThan(dobnplace52));
            output.println(dobnplace32.youngerThan(dobnplace52));
            output.println(dobnplace32.hasSameBirthDateAs(dobnplace52));
            output.println(dobnplace32.hasSameBirthDayAs(dobnplace52));
            output.println(dobnplace42.olderThan(dobnplace52));
            output.println(dobnplace42.youngerThan(dobnplace52));
            output.println(dobnplace42.hasSameBirthDateAs(dobnplace52));
            output.println(dobnplace42.hasSameBirthDayAs(dobnplace52));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
