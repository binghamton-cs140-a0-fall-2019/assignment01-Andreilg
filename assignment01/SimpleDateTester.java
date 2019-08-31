package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
    public static void main(String[] args) {
        SimpleDate simpDate = SimpleDate.of(2040, 5, 25);

        SimpleDate other0 = SimpleDate.of(2020, 5, 25);
        System.out.println(simpDate.before(other0));
        SimpleDate other1 = SimpleDate.of(2060, 5, 25);
        System.out.println(simpDate.before(other1));
        SimpleDate other2 = SimpleDate.of(2040, 3, 25);
        System.out.println(simpDate.before(other2));
        SimpleDate other3 = SimpleDate.of(2040, 7, 25);
        System.out.println(simpDate.before(other3));
        SimpleDate other4 = SimpleDate.of(2040, 5, 20);
        System.out.println(simpDate.before(other4));
        SimpleDate other5 = SimpleDate.of(2040, 5, 27);
        System.out.println(simpDate.before(other5));

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR SimpleDate.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            SimpleDate simpDate2 = SimpleDate.of(2040, 5, 25);

            SimpleDate other02 = SimpleDate.of(2020, 5, 25);
            output.println(simpDate2.before(other02));
            SimpleDate other12 = SimpleDate.of(2060, 5, 25);
            output.println(simpDate2.before(other12));
            SimpleDate other22 = SimpleDate.of(2040, 3, 25);
            output.println(simpDate2.before(other22));
            SimpleDate other32 = SimpleDate.of(2040, 7, 25);
            output.println(simpDate2.before(other32));
            SimpleDate other42 = SimpleDate.of(2040, 5, 20);
            output.println(simpDate2.before(other42));
            SimpleDate other52 = SimpleDate.of(2040, 5, 27);
            output.println(simpDate2.before(other52));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
