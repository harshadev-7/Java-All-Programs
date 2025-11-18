abstract class BankAccount {
    int accountNo;
    double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Abstract method to be overridden
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class FixedDeposit extends BankAccount {
    public FixedDeposit(int accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.07; // 7% interest
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount(101, 10000);
        accounts[1] = new FixedDeposit(102, 20000);

        for (BankAccount account : accounts) {
            System.out.println(account.getClass().getSimpleName() +
                " (Account No: " + account.accountNo + ") Interest: ₹" +
                account.calculateInterest());
        }
    }
}