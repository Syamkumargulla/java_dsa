package Abstractt;

public class Int {
    public static void main(String[] args) {
        Payment p1 = new PhonePe();
        p1.pay(1000);
        Payment p2 = new Googlepay();
        p2.pay(500);
    }}
interface Payment {
    void pay(int amount);
}
interface  notification{
    void noti();
}
class PhonePe implements Payment , notification {
    public void pay(int amount) {
        System.out.println("Payment done using PhonePe: " + amount);
    }

    public void noti() {
        System.out.println("user notifaction");
    }
}
    class Googlepay implements Payment, notification {
        public void pay(int amount) {
            System.out.println("Payment done using GPay: " + amount);
        }
        public void noti() {
            System.out.println("user notifaction");
        }
    }
