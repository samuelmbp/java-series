package lambdas;

public class LambdasDemo {
    public static String prefix = "-";

    public LambdasDemo(String message) {}

    public static void print(String message) {
    }

    public static void show() {
        // Lambda Expression -> Compact and easier to read expressions
        greet(message -> System.out.println(prefix + message));

        /* Method References -> shorter */
//        LambdasDemo demo = new LambdasDemo();
        greet(System.out::println);
        greet(LambdasDemo::print); // static methods
//        greet(this::print); // class instance method (no static)
//        greet(demo::print); // class instance method (no static)

        // Constructor reference
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new); // shorter
    }

    public static void greet(Printer printer) {
        printer.print("Hello World.");
    }
}
