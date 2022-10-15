package fundamentals;

public class Fundamentals {
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
    // System.out.println((double) 10 / (double) 3);
    // Implicit casting (automatic casting) byte -> short -> int
    // short x = 1;
    // int y = x + 2;
    // System.out.println(y); // 3

    // Explicit casting (manually casting)
    // String number = "1";
    // int c = Integer.parseInt(number) + 2;
    // System.out.println(c);

    // String number = "1.1";
    // double c = Double.parseDouble(number) + 2;
    // System.out.println(c);

    // =====================================
    // MATH CLASS
    // =====================================
    // int result = Math.round(1.1F); // 1
    // int result = (int)Math.ceil(1.1F); // 2
    // int result = (int)Math.floor(1.1F); // 1
    // int result = Math.max(1, 2); // 1
    // int result = Math.min(1, 2); // 1
    // int result = (short) Math.round(Math.random() * 100);
    // int result = (short) (Math.random() * 100);
    // System.out.println(result);

    // =====================================
    // FORMATTING NUMBERS
    // =====================================
    // NumberFormat currency = NumberFormat.getCurrencyInstance();
    // String result = currency.format(1234567.891);
    // System.out.println(result);

    // String result = NumberFormat.getPercentInstance().format(0.9);
    // System.out.println(result);

    // =====================================
    // READING INPUTS
    // =====================================

    // NUMBERS
    // Scanner scanner = new Scanner(System.in); // Terminal
    // System.out.print("Age: ");
    // byte age = scanner.nextByte();
    // System.out.println("You are " + age);

    // STRINGS
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Name: ");
    // // String name = scanner.next(); // Samuel
    // String name = scanner.nextLine().trim(); // Samuel Raducan
    // System.out.println("You are " + name);
}
