package Basic;

public class Numofpriime {
    public static void main(String[] args) {
      /*  int  n =29;
        boolean prime  = true;
        if(n<=1){
            prime = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    prime = false;
                    break;
                }
            }
        }
    if(prime){
        System.out.println("prime");
    }else {
        System.out.println("not");


       */


        for (int num =2 ; num <= 100; num++){
            boolean prime = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0){
                    prime = false;
                    break;
                }

            }
            if(prime){
                System.out.print(num + " ");
            }
     }
    }
}
