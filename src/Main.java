import generics.GenericList;

public class Main {
    public static void main(String[] args)  {
        new GenericList<Short>();
        new GenericList<Integer>();
        new GenericList<Byte>();
        new GenericList<Boolean>(); // error
        new GenericList<String>(); // error
    }
}
