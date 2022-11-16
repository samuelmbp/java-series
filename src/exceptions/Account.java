package exceptions;

import java.io.IOException;

// Throwing Exceptions -> Unchecked (No try-catch block needed)
public class Account {
    private float balance;

    /* Defensive Programming -> Unchecked /*
//    public void deposit(float value) {
//        if (value <= 0) throw new IllegalArgumentException();
//    }

    /* Checked -> Compiled Time */
    public void deposit(float amount) throws IOException {
       if (amount <= 0)
           throw new IOException();
    }

    /* Custom Exceptions */
    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException();
    }
}
