import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckingAccount a = new CheckingAccount(1);
        System.out.println("Please enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        a.deposit(depositAmount);

        try {
            System.out.println("Please enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            a.withdraw(withdrawAmount);
            System.out.printf("The balance after withdraw is $%.2f", a.getBalance());
        } catch (InsufficientFundsException e) {
        }



    }

}
