import collections.GenericList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }

        // Refactor with a forEach
        for (String item : list)
            System.out.println(item);
    }
}
