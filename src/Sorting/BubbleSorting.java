package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {7,12,9,11,3};
       bubble(arr);
            System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }



    /* int[] arr = {1, 2, 3, 9, 5, 7, 6, 4};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    Swape(arr , j ,j-1);
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Swape(int[]arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }*/




}
