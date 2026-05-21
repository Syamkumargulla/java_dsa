package Newmay;

import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        int[] arr = {10,0,20,0,8,0,6,4,};
        int  j=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
      System.out.println(Arrays.toString(arr));
    }
}
