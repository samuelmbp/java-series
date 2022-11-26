package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        /* Removes duplicates and the items are not ordered */
       Set<String> words = new HashSet<>();
       words.add("sky");
       words.add("is");
       words.add("blue");
       words.add("blue");
       System.out.println(words); // sky blue is

       /*  Remove duplicates from a Collection */
       Collection<String> collection = new ArrayList<>();
       Collections.addAll(collection, "a", "b", "c", "c");
       Set<String> words2 = new HashSet<>(collection);

        /* Set Operations */
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union -> Combination of two sets
        set1.addAll(set2);

        // Intersection -> Items common in both sets
        set1.retainAll(set2);

        // Difference -> Items that are not in the first set
        set1.removeAll(set2);
    }
}
