package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * TYPES OF EXCEPTIONS:
 *
 * 1. Checked (EXCEPTION)
 *  -> a developer should anticipate and handle properly
 *  -> get checked at the compiled time
 *
 * 2. Unchecked (RUNTIME EXCEPTIONS)
 *  -> occurs at runtime
 *
 * 3. Error
 *  -> external to our application
 *  -> e.g: StackOverflowError or OutOfMemoryError
 * */

public class ExceptionsDemo {
//    public static void show() {
//        // TODO: Checked Exceptions
//        // File does not exist
//        FileReader reader = new FileReader("file.txt");
//
//        // TODO: Unchecked Exceptions
//        // Prevent by writing tests and handling them
//        sayHello(null);
//
//        // TODO: Error Exceptions
//        //
//    }

    // Handle Checked Exceptions
    public static void show() {
//        try {
//            FileReader reader = new FileReader("file.txt");
//            int value = reader.read();
//            new SimpleDateFormat().parse("");
//        } catch (FileNotFoundException ex) {
//            System.out.println("File does not exist.");
//        } catch (IOException e) {
//            System.out.println("Could not read data.");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

        // Handle Multiple Exceptions
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            int value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("Could not read data.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
