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
        // int[] numbers = { 1, 5, 3, 4, 2 };
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers.length);

        // // MULTI-DIMENSIONAL ARRAYS
        // int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };
        // System.out.println(Arrays.deepToString((nums)));

        // ===================================
        // CONSTANTS
        // ===================================
        // final float PI = 3.14F;
        // // PI = 3.1F; // error
        // System.out.println(PI);

        // =====================================
        // CASTING AND TYPE CONVERSION
        // =====================================
        // double result = (double)10 / (double)3; // CASTING
        System.out.println((double) 10 / (double) 3);

        // Implicit casting (automatic casting) byte -> short -> int
        short x = 1;
        int y = x + 2;
        System.out.println(y); // 3

        // Explicit casting (manually casting)
        // String number = "1";
        // int c = Integer.parseInt(number) + 2;
        // System.out.println(c);

        String number = "1.1";
        double c = Double.parseDouble(number) + 2;
        System.out.println(c);
    }
}
