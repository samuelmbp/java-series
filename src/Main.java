import exceptions.Account;
import exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();
        Account account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
