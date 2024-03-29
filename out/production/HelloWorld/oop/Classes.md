// ===================================
// NOTE: Creating Objects / Instances
// ===================================

// textBox1 = variable(primitive -> STACK)  | new TextBox(Object -> HEAP)
TextBox textBox1 = new TextBox();
textBox1.setText("Box One");
System.out.println(textBox1.text.toUpperCase());

TextBox textBox2 = new TextBox();
textBox2.setText("Box Two");
System.out.println(textBox2.text);

// ===================================
// NOTE: Memory Allocation
// ===================================

// HEAP (Objects storage - Reference types)
// STACK ( Primitives and short-lived variables)
TextBox textBox2 = textBox1;
System.out.println(textBox1); // oop.TextBox@4dd8dc3
System.out.println(textBox2); // oop.TextBox@4dd8dc3
textBox2.setText("Hello, world.");
System.out.println(textBox1.text); // "Hello, world!" (NOT "Box One") -> Referencing the same object


// ===================================
// NOTE: Procedural Programming
// ===================================
int baseSalary = 50_000;
int extraHours = 10;
int hourlyRate = 20;

int wage = calculateWage(baseSalary, extraHours, hourlyRate);
System.out.println(wage);
public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
return baseSalary + extraHours * hourlyRate;
}

// =====================================
// Coupling
// =====================================
Browser browser = new Browser();
browser.navigate("...");


// ===================================
// Encapsulation
// ===================================
Employee employee = new Employee(50_000, 20);
//        Employee employee = new Employee(50_000);
int wage = employee.calculateWage(10);
System.out.println(wage);

// ===================================
// Static Members
// ===================================
System.out.println(Employee.numberOfEmployees);
Employee.printNumberOfEmployees();

// =====================================
The Object Class
// =====================================
TextBox box1 = new TextBox();
TextBox box2 = box1;
System.out.println(box1.hashCode()); // 123456
System.out.println(box2.hashCode()); // 123456
System.out.println(box1.equals(box2)); // true
System.out.println(box1.toString());

// =====================================
// Polymorphism
// =====================================
UIControl[] controls = { new TextBox(), new CheckBox()};
for (UIControl control : controls) {
control.render();
}

// =====================================
// Constructor Injection
// =====================================
TaxCalculator2018 taxCalculator = new TaxCalculator2018(100_000);
TaxReport taxReport = new TaxReport(taxCalculator);
taxReport.show(taxReport);

// =====================================
// Method Injection
// =====================================
TaxCalculator2018 taxCalculator = new TaxCalculator2018(100_000);
TaxReport taxReport = new TaxReport();
taxReport.show(taxCalculator);
taxReport.show(new TaxCalculator2019());

// =====================================
// Setter Injection
// =====================================
taxReport.setTaxCalculator(new TaxCalculator2019());
taxReport.show();