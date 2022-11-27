package lambdas;

public class LambdasDemo {
    public static void show() {
        // Anonymous inner classes
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World.");
    }
}
