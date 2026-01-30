package oops;

public class Overaing {
    public static void main(String[] args) {
        Paymant p;
        p =new UPII();
        p.pay();
        p =new CARDD();
        p.pay();

    }}
class Paymant{
        void pay(){
            System.out.println("generic apyment");
        }
    }
class UPII extends Paymant{
    @Override
    void pay(){
        System.out.println("payment via upi");
    }
}
class CARDD extends Paymant{
    @Override
    void pay(){
        System.out.println("paying via card");
    }
}
