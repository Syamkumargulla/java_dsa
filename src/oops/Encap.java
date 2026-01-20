package oops;
//Encapsulation = Wrapping data + methods together
//✔ Use private variables
//✔ Access them using getters & setters
    class BankAccount {
        private int balance = 1000;
        public int getBalance() {
            return balance;
        }
        public void setBalance(int amount) {
            if (amount > 0) {
                balance = amount;
            }
        }
    }
    public class Encap {
        public static void main(String[] args) {
            BankAccount acc = new BankAccount();
            acc.setBalance(5000);
            System.out.println(acc.getBalance());
        }
    }


