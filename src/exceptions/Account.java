package exceptions;

import java.io.IOException;

// Throwing Exceptions -> Unchecked (No try-catch block needed)
public class Account {

    // Defensive Programming -> Unchecked
//    public void deposit(float value) {
//        if (value <= 0) throw new IllegalArgumentException();
//    }

    // Checked -> Compiled Time
    public void deposit(float value) throws IOException {
       if (value <= 0)
           throw new IOException();
    }
}
