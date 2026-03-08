package Abstractt;

public class Interfaceeee {
    public static void main(String[] args) {
        Payementgate p1 = new Phonepe();
        Payementgate p2 = new gpay();
        p1.processPayemnt(100);
        p2.processPayemnt(200);
    }
}
interface Payementgate{
    void processPayemnt(double amount);
}
class Phonepe implements Payementgate {
    public void processPayemnt(double amount){
        System.out.println("payment via  Phone  pe:" + amount);
    }
}

class gpay implements  Payementgate{
    public void processPayemnt(double amount){
        System.out.println("paymnet va Gpay" + amount);
    }
}