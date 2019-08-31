package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
    public static void main(String[] args) {
        //In the main method make a Person and use it to make a ComputerOwner object and 4 computers.
        // Add the 4 computers to the owner and print the object.
        // Then remove 2 computers and print it again.
        DateAndPlaceOfBirth ownerDOB = new DateAndPlaceOfBirth(1994, 5, 14, "Bronx", "NY", "USA");
        StreetUSAddress ownerAddress = new StreetUSAddress("63-21 Alderton St", "", "Rego Park", "NY", "11374");
        Person owner = new Person("Bob", "Builder", "142-23-2405", ownerDOB, ownerAddress);
        ComputerOwner compOwner = new ComputerOwner(owner);
        Computer comp1 = new Computer("Dell", "AMD Ryzen 5 1600X", 16, 2000, false, 1599.99);
        Computer comp2 = new Computer("Alienware", "Intel Core i9 9900K", 32, 3000, true, 1999.99);
        Computer comp3 = new Computer("PowerPC", "Intel Core i3-9100F", 16, 900, true, 1199.99);
        Computer comp4 = new Computer("Toshiba", "AMD Ryzen 3 2200G", 8, 500, false, 999.99);
        compOwner.addComputer(comp1);
        compOwner.addComputer(comp2);
        compOwner.addComputer(comp3);
        compOwner.addComputer(comp4);
        System.out.println(compOwner);
        compOwner.removeComputer(3);
        compOwner.removeComputer(2);
        System.out.println(compOwner);

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR ComputerOwner.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            DateAndPlaceOfBirth ownerDOB2 = new DateAndPlaceOfBirth(1994, 5, 14, "Bronx", "NY", "USA");
            StreetUSAddress ownerAddress2 = new StreetUSAddress("63-21 Alderton St", "", "Rego Park", "NY", "11374");
            Person owner2 = new Person("Bob", "Builder", "142-23-2405", ownerDOB2, ownerAddress2);
            ComputerOwner compOwner2 = new ComputerOwner(owner2);
            Computer comp12 = new Computer("Dell", "AMD Ryzen 5 1600X", 16, 2000, false, 1599.99);
            Computer comp22 = new Computer("Alienware", "Intel Core i9 9900K", 32, 3000, true, 1999.99);
            Computer comp32 = new Computer("PowerPC", "Intel Core i3-9100F", 16, 900, true, 1199.99);
            Computer comp42 = new Computer("Toshiba", "AMD Ryzen 3 2200G", 8, 500, false, 999.99);
            compOwner.addComputer(comp12);
            compOwner.addComputer(comp22);
            compOwner.addComputer(comp32);
            compOwner.addComputer(comp42);
            output.println(compOwner2);
            compOwner.removeComputer(3);
            compOwner.removeComputer(2);
            output.println(compOwner2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
