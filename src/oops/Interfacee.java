package oops;

public class Interfacee {
    public static void main(String[] args) {
        payment p1 = new UPI() ;
        p1.pay();
        payment p2 = new Card();
        p2.pay();
    }}
    interface payment {
        void pay();
    }//abstract by defualt
    //implentation
    class UPI implements  payment{
        public void pay(){
            System.out.println("pay by upi");
        }
    }
    class  Card implements  payment{
    @Override
        public void pay(){
            System.out.println("paying by thcard");
        }
    }


