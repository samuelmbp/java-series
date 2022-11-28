package lambdas;


import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static String prefix = "-";

    public LambdasDemo(String message) {}

    public static void print(String message) {
    }

    /* Consumer Interface */
    public static void showConsumer() {
        List<Integer> list = List.of(1,2, 3);

        // Imperative Programming (for, if/else, switch/case) -> "How it should be done"
        for (int item : list) 
            System.out.println(item);

        // Declarative Programming -> "What needs to be done"
        list.forEach(System.out::println);

        // Chaining Consumers
        List<String> listString = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        listString.forEach(print.andThen(printUpperCase).andThen(print));
    }


    /* Lambdas Expressions -> Benefit: more compact and easier to read */
    public static void show() {
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
