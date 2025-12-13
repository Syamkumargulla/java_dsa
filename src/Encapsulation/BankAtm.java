package Encapsulation;

public class BankAtm {

    // Inner class
    class PaymentProcessor {
        private String cardNumber;
        private double amount;

        public PaymentProcessor(String cardNumber, double amount) {
            this.cardNumber = maskCardNumber(cardNumber);
            this.amount = amount;
        }

        private String maskCardNumber(String cardNumber) {
            return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        }

        public void processPayment() {
            System.out.println("Processing payment of ₹" + amount + " for card " + cardNumber);
        }
    }

    // main method should be static — so create an instance of BankAtm first
    public static void main(String[] args) {
        BankAtm atm = new BankAtm(); // outer class object
        PaymentProcessor payment = atm.new PaymentProcessor("1234-1234-1234-1234", 250.00);
        payment.processPayment();
    }
}
