import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // PRIMITIVE TYPES
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'a';
        boolean isEligible = true; // or false

        // REFERENCE TYPES
        Date now = new Date();
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // 2, 1
    }
}
