package collections;

import java.util.*;

/* Hash Table -> Data Structure in CS */
public class MapDemo {
    public static void show() {
        Customer c1 =
                new Customer("Samuel", "e1");
        Customer c2 =
                new Customer("Jason", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // Instead of using a loop, use a hash map to find an obj
        // -> speed wise it's much faster no matter the size
        Customer customer = map.get("e1");
        System.out.println(customer); // Samuel

        // Null for non existent customers
        System.out.println(map.get("e10"));

        // Default for a non existent customer
        Customer unknown = new Customer("Unknown", "");
        Customer defaultCustomer = map.getOrDefault("e7", unknown);
        System.out.println(defaultCustomer);

        // Contains a key
        System.out.println(map.containsKey("e9")); // false

        // Replace a customer
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        // Using loops -> keys
        for (String key: map.keySet())
            System.out.println(key); // e1 e2

        // Using loops -> with entrySet (key=value)
        for (Map.Entry<String, Customer> entry: map.entrySet())
            System.out.println(entry); // e1=a++ e2=Jason
//            System.out.println(entry.getValue()); // a++ Jason
//            System.out.println(entry.getKey()); // e1 e2

        // Using loops -> values
        for (Customer customerName : map.values())
            System.out.println(customerName);
    }
}
