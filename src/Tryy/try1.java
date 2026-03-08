package Tryy;

import java.util.Arrays;
import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        payment t1 = new card();
        payment t2 = new upi();
        t1.pay(500);
        t2.pay(500);
    }
}
abstract  class payment{
    abstract  void pay(double amount);
}
class  card extends payment{
    @Override
    void pay(double amount){
        System.out.println("paid using card:" + amount);
    }
}
class  upi extends payment{
    @Override
    void pay(double amount){
        System.out.println("payment by the upi:" + amount);
    }
}
