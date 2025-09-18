package Arrays.Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the array elements to store:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 5;
        int ans =  liner(arr, target);
        System.out.println(ans);
    }
    static int liner(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++) {
           if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
