package oop;

// Inherits from UIControl
public class TextBox extends UIControl {
    private String text = "";

//    public TextBox() {
////        super(true); // Call to the parent class
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("RENDER TEXT BOX");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    // Method Overriding
    @Override
    public String toString() {
        return text;
    }
}
