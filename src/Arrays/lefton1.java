package Arrays;

import java.util.Arrays;

public class lefton1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int  n = arr.length;
        int d =1;
        int f = arr[0];
       // int[] temp = new int[n];
        for(int i =d; i<n; i++){
            arr[i-d] = arr[i];
        }
        arr[arr.length-1] = f;
        System.out.println(Arrays.toString(arr));
    }
}
