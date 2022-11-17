import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args)  {
      GenericList<Instructor> instructors = new GenericList<>();
      GenericList<User> users = new GenericList<>();

        Utils.printUsers(new GenericList<Instructor>());
    }
}
