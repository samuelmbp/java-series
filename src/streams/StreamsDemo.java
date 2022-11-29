package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* Streams: Process a collection of data in a declarative/functional way */
public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Imperative Programming -> "How something should be done"
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10) count++;
        }

        // Declarative/Functional Programming -> "What needs to be done"
        long count2 = movies
                .stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        /* Creating a stream */

        // Collection
        ArrayList<String> list = new ArrayList<>();
//        list.stream();

        int[] numbers = { 1,2,3 };
        Arrays.stream(numbers).forEach(number -> System.out.println(number));

        // Generate unlimited numbers / or limit
        Stream.generate(() -> Math.random()).limit(10).forEach(number -> System.out.println(number)); // One way

        // Unary operator: takes a value and returns a new value
        Stream.iterate(1, number -> number + 1).limit(10).forEach(number -> System.out.println(number)); // numbers 1...10
    }
}
