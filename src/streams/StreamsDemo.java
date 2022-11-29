package streams;

import java.util.List;

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
    }
}
