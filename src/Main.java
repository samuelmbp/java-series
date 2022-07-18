import java.util.Arrays;
import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // PRIMITIVE TYPES
        // byte age = 30;
        // long viewsCount = 3_123_456_789L;
        // float price = 10.99F;
        // char letter = 'a';
        // boolean isEligible = true; // or false

        // REFERENCE TYPES
        // Date now = new Date();
        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // point1.x = 2;
        // System.out.println(point2); // 2, 1

        // STRINGS
        // String message = "Hello, \"Samuel\" !";
        // System.out.println(message.endsWith("!"));
        // System.out.println(message.length());
        // System.out.println(message.indexOf('H')); // Index
        // System.out.println(message.replace("!", "*")); // Returns a new string obj.
        // System.out.println(message.toLowerCase());
        // System.out.println(message.trim());

        // ==================================
        // ARRAYS (HAVE A FIXED LENGTH)
        // ==================================
        int[] numbers = { 1, 5, 3, 4, 2 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // MULTI-DIMENSIONAL ARRAYS
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString((nums)));
    }
}
