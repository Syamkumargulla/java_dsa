package oops;

public class Abstract {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.dispay();
        System.out.println("intrest " + b1.getinterest());

        Bank b2 = new HDFC();
        b2.dispay();
        System.out.println("intrest " + b1.getinterest());
    }
}
    abstract class Bank{
        String bankName;
        Bank(String bankName){
            this.bankName = bankName;
        }
        //ab medtho
        abstract double getinterest();

        //nrml
        void  dispay(){
            System.out.println("bank name "+bankName );
        }
    }
    class SBI extends Bank{
        SBI(){
            super("SBI");
        }
        double getinterest(){
            return  6.5;
        }
    }

class HDFC extends Bank {

    HDFC() {
        super("HDFC");
    }
    double getinterest() {
        return 7.2;
    }
}


