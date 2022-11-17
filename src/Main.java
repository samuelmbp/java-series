import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args)  {
        int max = Utils.max(1, 2);
        System.out.println(max);
        User user = Utils.max(new User(10), new User(20));
        System.out.println(user);
    }
}
