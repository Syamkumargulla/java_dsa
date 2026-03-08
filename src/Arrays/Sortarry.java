package Arrays;

import java.util.Arrays;

public class Sortarry {
    public static void main(String[] args) {
        int[] arr = {1,7,3,5,6,4,8,2};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <= arr.length-1; j++) {
                if(arr[j] < arr[j - 1]){
                    swap(arr ,  j , j-1);
                }
            }

        }


        System.out.println(Arrays.toString(arr));
    }
    public  static void swap(int[] arr ,int s , int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
