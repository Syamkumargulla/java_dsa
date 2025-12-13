package Basic;

public class Dicepr {
    public static void main(String[] args) {
         int n = 3;
        switch (n){
             case 1:
                 System.out.println(6);
                 break;
             case 2:
                 System.out.println(5);
                 break;
             case 3:
                 System.out.println(4);
                 break;
             case 4:
                 System.out.println(3);
                 break;
             case 5:
                 System.out.println(2);
                 break;
             case 6:
                 System.out.println(1);
                 break;
             default:
                 System.out.println("errro:");
         }


        System.out.println(n);


    }
}
