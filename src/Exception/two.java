package Exception;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        deom11 d1 = new deom11();
        d1.aplha();
    }
}
class  deom11{
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