package Arrays;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1 ,2,3,4,8,5,6,7,9};

        System.out.println(maxx(arr));
    }
    static int maxx(int[] arr){
        int max =0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                max = arr[i];
            }
        }
        return  max;
    }
}
