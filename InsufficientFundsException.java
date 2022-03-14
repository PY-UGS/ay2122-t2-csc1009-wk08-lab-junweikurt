
import java.io.*;
public class InsufficientFundsException extends Exception {
    private final double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
        System.out.printf("Sorry, but your account is short by $ %.2f", amount);
    }

    public double getAmount() {
        return amount;
    }
}
