package Arrays;
import java.util.*;

public class ArraysBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
       // int[] arr1 = {1,3,4,5,6,8};

        //arr[0] = 23;
       // arr[1] =47;
      //  System.out.println(arr1[2]);


        for (int i = 0; i < args.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int n:arr){
            System.out.print(n);
        }

    }
}
