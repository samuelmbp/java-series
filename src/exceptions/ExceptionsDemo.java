package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

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
        try {
            FileReader reader = new FileReader("file.txt");
            System.out.println("File opened.");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
