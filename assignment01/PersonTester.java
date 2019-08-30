package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
    public static void main(String[] args) {
        Person me = new Person("Andrei", "Georgescu", "123-45-6789", "idk", "idk" );
        System.out.println(me);

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR Person.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            Person me2 = new Person("Andrei", "Georgescu", "123-45-6789", "idk", "idk" );
            output.println(me2);

            Computer comp12 = new Computer("Dell", "AMD Ryzen 5 1600X", 16, 2000, false, 1599.99);
            output.println(comp1);
            Computer comp22 = new Computer("Alienware", "Intel Core i9 9900K", 32, 3000, true, 1999.99);
            output.println(comp2);
            Computer comp32 = new Computer("Dell", "Intel Core i3-9100F", 16, 900, true, 1199.99);
            output.println(comp3);
            Computer comp42 = new Computer("Dell", "AMD Ryzen 3 2200G", 8, 500, false, 999.99);
            output.println(comp4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
