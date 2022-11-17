import generics.User;

public class Main {
    public static void main(String[] args)  {
        User user1 = new User(40);
        User user2 = new User(50);

//        System.out.println(user1.compareTo(user2));
        if (user1.compareTo(user2) < 0)
            System.out.println("User 1 < user 2");
        else if(user1.compareTo(user2) == 0)
            System.out.println("User1 == User 2");
        else System.out.println("User1 > User2");
    }
}
