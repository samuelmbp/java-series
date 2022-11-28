package lambdas;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public static String prefix = "-";

    public LambdasDemo(String message) {}

    public static void print(String message) {
    }

    /* Function Interface */
    public static void showFunctionInterface() {
//        Function<String, Integer> map = str -> str.length();
        Function<String, Integer> map = String::length;
        Integer length = map.apply("Sky");
        System.out.println(length);

        // Compose Small Reusable Functions
        /*
         * "key:value"
         * first: "key=value"
         * second: "{key=value}
        */
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        // Declarative Programming
        String result = replaceColon
                        .andThen(addBraces)
                        .apply("key:value");
        System.out.println(result); // {key=value}

        String reversedResult = addBraces
                                .compose(replaceColon)
                                .apply("key:value");
        System.out.println(reversedResult); // {key=value}


    }

/* Supplier Interface -> Supplies a value */
    public static void showSupplier() {
        // Supplier<Double> getRandom = () -> Math.random();
        Supplier<Double> getRandom = Math::random;
        Double randomValue = getRandom.get();
        System.out.println(randomValue);
    }

    /* Consumer Interface -> Consumes a value */
    public static void showConsumer() {
        List<Integer> list = List.of(1,2, 3);

        // Imperative Programming (for, if/else, switch/case) -> "How it should be done"
        for (int item : list) 
            System.out.println(item);

        // Declarative Programming -> "What needs to be done"
        list.forEach(System.out::println);
        list.forEach(item -> System.out.println(item));

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
