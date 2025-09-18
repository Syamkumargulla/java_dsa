package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        /* int [][] arr = {
        {1,2,3},
        {5,6,7},
        {8,9,0}
        }
         */
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        System.out.print("Enter eliments in2d array:");
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i< arr.length; i++ ){
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
