package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
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
        list.stream();

        int[] numbers = { 1,2,3 };
        Arrays.stream(numbers).forEach(number -> System.out.println(number));

        // Generate unlimited numbers / or limit
        Stream.generate(() -> Math.random()).limit(10).forEach(number -> System.out.println(number)); // One way

        // Unary operator: takes a value and returns a new value
        Stream.iterate(1, number -> number + 1).limit(10).forEach(number -> System.out.println(number)); // numbers 1...10
    }

    /* Transform the values in a stream */
    public static void mappingElements() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Map -> work with all the values
        movies.stream()
                .map(Movie::getTitle)
                .forEach(name -> System.out.println(name.toUpperCase()));

        // FlatMap -> work with individual values
        Stream<List<Integer>> stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream.flatMap(list -> list.stream()).forEach(number -> System.out.println(number));
    }

    public static void filteringElements() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 15),
                new Movie("Red Notice", 20)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
