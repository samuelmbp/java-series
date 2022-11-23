package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. Ordered Collection
2. Supports Indexing
3. Can add multiple items at once
*/
public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        Collections.addAll(list, "d", "c");
        System.out.println(list.get(0));
        list.set(0, "a+");
        list.remove(0);
        System.out.println(list.indexOf("a")); // 0
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.subList(0, 2)); // returns a new list
    }
}
