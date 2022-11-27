package lambdas;

public class LambdasDemo {
    public static void show() {
        // Lambda Expression
        greet(message -> System.out.println(message));

        // Store lambda expression in a variable
        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World.");
    }
}
