package Encapsulation;

public class Enacap {


    public class BankAccount {
        private double balance; // Internal state is hidden

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            balance += amount;
        }
        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance; // Controlled access
        }
    }


    public static void main(String[] args) {
        Enacap en = new Enacap();
        BankAccount account = en.new BankAccount();

        account.deposit(1000);
        account.withdraw(300);

        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
