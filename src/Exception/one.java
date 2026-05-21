package Exception;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        System.out.println("c4");
        demo3 d3 = new demo3();
        d3.gama();
        System.out.println("ter");
    }
}
class  deom1{
    public  void  aplha()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter");
            int a = sc.nextInt();
            System.out.println("enter");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("non zero");
        }
        System.out.println("terminte");
    }
}
class demo2 {
    public void beta(){
        System.out.printf("ce");
        deom1 d1 = new deom1();
        d1.aplha();
        System.out.println("tereminte");
    }
}
class demo3{
    void gama(){
        System.out.printf("ce 2");
        demo2 d2 = new demo2();
        d2.beta();
        System.out.println("tereminte");
    }
}