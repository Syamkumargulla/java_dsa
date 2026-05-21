package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1 ,2,3,4,5,6,7};
        swapp(arr, 1 ,3);
        System.out.println(Arrays.toString(arr));
    }
    static void  swapp(int[] arr, int s, int j){
        int temp = arr[s];
        arr[s] = arr[j];
        arr[j] = temp;
    }
}
