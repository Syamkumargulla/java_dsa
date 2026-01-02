package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        inset(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void  inset(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    Swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void Swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
