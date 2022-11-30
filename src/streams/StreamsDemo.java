package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

    // =====================================================================
    /* TODO: INTERMEDIATE OPERATIONS - BUILD AND CUSTOMISE THE PIPELINES */
    // =====================================================================

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

    public static void slicingStreams() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 30),
                new Movie("Red Notice", 20)
        );

        // Good for pagination
        movies.stream().skip(1).limit(2).forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream()
                // returns only 10 likes (true when finds the first occurrence and then false) -> does not continue the filtering as 30 comes next.
                // filter -> looks at all the elements in a list and returns all the matching ones.
                .takeWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream()
                // Skip all the elements that match the criteria and returns the rest
                /*
                    Murder on the Orient Express
                    Red Notice
                */
                .dropWhile(movie -> movie.getLikes() < 30) // skips 10 likes and returns everything after 30 (30, 20)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    public static void sortingStreams() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        /* Change the order */
        // a, b -> movie objects
        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle())) // (Longer)
//                .sorted(Comparator.comparing(Movie::getTitle)) // A - Z (Cleaner)
                .sorted(Comparator.comparing(Movie::getTitle).reversed()) // Z - A
                .forEach(movie -> System.out.println(movie.getTitle()));
    }

    public static void gettingUniqueElements() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct() // Unique Elements
                .forEach(System.out::println);
    }

    public static void peekingElements() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        // Peek -> Get the output of each operation (good for debugging)
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("Filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(title -> System.out.println("Mapped: " + title))
                .forEach(System.out::println);

         /* OUTPUT:
            Filtered: Murder on the Orient Express
            Mapped: Murder on the Orient Express
            Murder on the Orient Express
            Filtered: Red Notice
            Mapped: Red Notice
            Red Notice
         *  */
    }


    // ============================================================================
    /* TODO: REDUCERS OPERATIONS - REDUCE A STREAM OF OBJECTS TO A SINGLE OBJECT */
    // ============================================================================
    public static void simpleReducers() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        movies.stream().count(); // 3 movies

        /* Matchers */
        movies.stream().anyMatch(movie -> movie.getLikes() > 10); // true
        movies.stream().allMatch(movie -> movie.getLikes() > 10); // false
        movies.stream().noneMatch(movie -> movie.getLikes() > 10); // false

        Movie firstMovie = movies.stream().findFirst().get(); // The God Father
        Movie maxLikes = movies.stream().max(Comparator.comparing(Movie::getLikes)).get(); // 30
        Movie minLikes = movies.stream().min(Comparator.comparing(Movie::getLikes)).get(); // 10

        System.out.println(minLikes.getLikes());

    }

    public static void reducingStreams() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        Integer total = movies.stream()
                .map(Movie::getLikes) // [10, 20, 30]
//                .reduce((a, b) -> a + b);
                .reduce(0, Integer::sum);

        System.out.println(total);
    }

    /* Collect the result into a data structure: e.g.: List, Set, Map */
    public static void collectors() {
        List<Movie> movies = List.of(
                new Movie("The Godfather", 10),
                new Movie("Murder on the Orient Express", 20),
                new Movie("Red Notice", 30)
        );

        Map<String, Integer> result = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.toList())
//                .collect(Collectors.toSet())
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes)); // {Red Notice=30, Murder on the Orient Express=20}

        Integer sumIntegers = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));// 50

        IntSummaryStatistics statistics = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes)); // IntSummaryStatistics{count=2, sum=50, min=20, average=25.000000, max=30}

        String commaSeparatedMovies = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", ")); // Murder on the Orient Express, Red Notice
    }

    public static void groupingElements() {
        List<MovieWithGenre> movies = List.of(
                new MovieWithGenre("The Godfather", 10, Genre.THRILLER),
                new MovieWithGenre("Murder on the Orient Express", 20, Genre.ACTION),
                new MovieWithGenre("Red Notice", 30, Genre.ACTION)
        );

        // {THRILLER=[The Godfather], ACTION=[Murder on the Orient Express, Red Notice]}
        Map<Genre, List<MovieWithGenre>> resultList = movies.stream()
                .collect(Collectors.groupingBy(MovieWithGenre::getGenre));


        // {ACTION=[Murder on the Orient Express, Red Notice], THRILLER=[The Godfather]}
        Map<Genre, Set<MovieWithGenre>> resultSet = movies.stream()
                .collect(Collectors.groupingBy(
                        MovieWithGenre::getGenre, Collectors.toSet()));

        // {ACTION=2, THRILLER=1}
        Map<Genre, Long> resultCount = movies.stream()
                .collect(Collectors.groupingBy(
                        MovieWithGenre::getGenre, Collectors.counting()));

        System.out.println(resultCount);
    }

    public static void partitioningElements() {
        List<MovieWithGenre> movies = List.of(
                new MovieWithGenre("The Godfather", 10, Genre.THRILLER),
                new MovieWithGenre("Murder on the Orient Express", 20, Genre.ACTION),
                new MovieWithGenre("Red Notice", 30, Genre.ACTION)
        );

        // {false=[The Godfather, Murder on the Orient Express], true=[Red Notice]}
        Map<Boolean, List<MovieWithGenre>> resultList = movies.stream()
                .collect(Collectors.partitioningBy(movie -> movie.getLikes() > 20));

        // {false=The Godfather, Murder on the Orient Express, true=Red Notice}
        Map<Boolean, String> resultKeyValuePair = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 20,
                        Collectors.mapping(MovieWithGenre::getTitle, Collectors.joining(", "))));

        System.out.println(resultKeyValuePair);
    }
}
