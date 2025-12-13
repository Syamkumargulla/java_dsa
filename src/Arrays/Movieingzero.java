package Arrays;

import java.util.Arrays;

public class Movieingzero {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,4,5,0,7,0,8,9,0};


       /* int[] temp = new int[arr.length] ;
        int index = 0;
        for(int i:arr) {
            if(arr[i] != 0){
                temp[index] =arr[i];
                index++;
            }
        }

        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != 0){
                arr[j] = arr[i];
            j++;
            }
        }
        while (j < arr.length){  arr[j] =0 ;
           j++; }

        */


        int j=0;
        for(int i = 0; i < arr.length ; i++) {
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
