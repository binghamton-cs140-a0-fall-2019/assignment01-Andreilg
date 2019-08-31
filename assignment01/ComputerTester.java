package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
    public static void main(String[] args) {
        //TODO make 4 different Computer objects with different
        //combinations of disk size (two more than a terabyte and two less)
        //and for each make one an SSD drive and the other not.
        //Then call System.out.println(comp); for each "comp" object
        //and observe that there are small differences in how the computer
        //information prints out.
        Computer comp1 = new Computer("Dell", "AMD Ryzen 5 1600X", 16, 2000, false, 1599.99);
        System.out.println(comp1);
        Computer comp2 = new Computer("Alienware", "Intel Core i9 9900K", 32, 3000, true, 1999.99);
        System.out.println(comp2);
        Computer comp3 = new Computer("PowerPC", "Intel Core i3-9100F", 16, 900, true, 1199.99);
        System.out.println(comp3);
        Computer comp4 = new Computer("Toshiba", "AMD Ryzen 3 2200G", 8, 500, false, 999.99);
        System.out.println(comp4);

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR Computer.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            Computer comp12 = new Computer("Dell", "AMD Ryzen 5 1600X", 16, 2000, false, 1599.99);
            output.println(comp12);
            Computer comp22 = new Computer("Alienware", "Intel Core i9 9900K", 32, 3000, true, 1999.99);
            output.println(comp22);
            Computer comp32 = new Computer("PowerPC", "Intel Core i3-9100F", 16, 900, true, 1199.99);
            output.println(comp32);
            Computer comp42 = new Computer("Toshiba", "AMD Ryzen 3 2200G", 8, 500, false, 999.99);
            output.println(comp42);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}