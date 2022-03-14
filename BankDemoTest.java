import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckingAccount cyrus = new CheckingAccount(1);
        System.out.println("Please enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        cyrus.deposit(depositAmount);

        try {
            System.out.println("Please enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            cyrus.withdraw(withdrawAmount);
            System.out.printf("The balance after withdraw is $%.2f",cyrus.getBalance());
        } catch (InsufficientFundsException e) {
        }



    }

}
