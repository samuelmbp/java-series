package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");

        // Add all items at once
        Collections.addAll(collection, "a", "b", "c");
        // Object[] objectArr = collection.toArray();
        // String[] stringArr = collection.toArray(new String[0]);
        // stringArr[0].toLowerCase();

        for (String item : collection)
            System.out.println(item);

        // System.out.println(collection); // [a, b]
        // System.out.println(collection.contains("a"));
        // collection.remove("a");
        // collection.clear(); // removes all items
        // System.out.println(collection.isEmpty());
        // System.out.println(collection.size());

        // Check for object equality
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); // False: 2 different object in the memory
        System.out.println(collection.equals(other)); // True: have the same elements/content
    }
}
