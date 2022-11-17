import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args)  {
        List list = new List();
        list.add(1);
        list.add("1");
        list.add(new User());

        int number = (int)list.get(1);
        System.out.println(number);
    }
}
