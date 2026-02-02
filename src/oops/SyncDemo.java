package oops;
class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    ", balance: " + balance);
        }
    }
}

class User extends Thread {
    BankAccount acc;

    User(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(700);
    }
}

public class SyncDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        User u1 = new User(acc);
        User u2 = new User(acc);

        u1.start();
        u2.start();
    }
}

