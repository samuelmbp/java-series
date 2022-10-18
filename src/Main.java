import oop.CheckBox;
import oop.TextBox;
import oop.UIControl;

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (UIControl control : controls) {
            control.render();
        }
    }
}
