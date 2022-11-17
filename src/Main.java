import generics.GenericList;

public class Main {
    public static void main(String[] args)  {
//      new GenericList<Integer>().add(1);
//        new GenericList<User>().add(new User());
        GenericList<String> list =  new GenericList<>();
        list.add("a");
        String number = list.get(0);
        System.out.println(number);
    }
}
