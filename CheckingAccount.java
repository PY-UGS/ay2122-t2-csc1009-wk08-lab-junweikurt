public class CheckingAccount {
    private double accBalance;
    private int accNumber;

    public CheckingAccount(int accNumber) {
        this.accNumber = accNumber;
        this.accBalance = 0;
    }

    public CheckingAccount(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.accBalance = balance;
    }

    public void deposit(double amount) {
        this.accBalance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.accBalance) {
            throw new InsufficientFundsException(amount - this.accBalance);
        }
        this.accBalance -= amount;
    }

    public double getBalance() {
        return accBalance;
    }

    public int getNumber() {
        return this.accNumber;
    }
}
