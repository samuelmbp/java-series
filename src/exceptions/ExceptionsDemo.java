package exceptions;

import java.io.FileReader;

/**
 * TYPES OF EXCEPTIONS:
 *
 * 1. Checked
 *  -> a developer should anticipate and handle properly
 *  -> get checked at the compiled time
 *
 * 2. Unchecked
 *  -> runtime exceptions -> occurs at runtime
 *
 * 3. Error
 *  -> external to our application
 *  -> e.g: StackOverflowError or OutOfMemoryError
 * */

public class ExceptionsDemo {
    public static void show() {
        // TODO: Checked Exceptions
        // File does not exist
        FileReader reader = new FileReader("file.txt");

        // TODO: Unchecked Exceptions
        // Prevent by writing tests and handling them
        sayHello(null);

        // TODO: Error Exceptions
        //
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
