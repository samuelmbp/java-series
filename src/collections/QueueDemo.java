package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b"); // when full returns an exception
        queue.offer("d"); // when full returns false
        // d -> b -> a -> c

        String front = queue.peek(); // returns the first item (top)
        System.out.println(front);
        System.out.println(queue.remove()); // c
    }
}
