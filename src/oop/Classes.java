package oop;

public class Classes {
    // ===================================
    // NOTE: Creating Objects / Instances
    // ===================================

    // textBox1 = variable(primitive -> STACK)  | new TextBox(Object -> HEAP)
//        TextBox textBox1 = new TextBox();
//        textBox1.setText("Box One");
//        System.out.println(textBox1.text.toUpperCase());

//        TextBox textBox2 = new TextBox();
//        textBox2.setText("Box Two");
//        System.out.println(textBox2.text);

    // ===================================
    // NOTE: Memory Allocation
    // ===================================

    // HEAP (Objects storage - Reference types)
    // STACK ( Primitives and short-lived variables)
//        TextBox textBox2 = textBox1;
//        System.out.println(textBox1); // oop.TextBox@4dd8dc3
//        System.out.println(textBox2); // oop.TextBox@4dd8dc3
//        textBox2.setText("Hello, world.");
//        System.out.println(textBox1.text); // "Hello, world!" (NOT "Box One") -> Referencing the same object


    // ===================================
    // NOTE: Procedural Programming
    // ===================================
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//
//        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//        System.out.println(wage);
//    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
//        return baseSalary + extraHours * hourlyRate;
//    }

    // =====================================
    // Coupling
    // =====================================
//    Browser browser = new Browser();
//        browser.navigate("...");
}
