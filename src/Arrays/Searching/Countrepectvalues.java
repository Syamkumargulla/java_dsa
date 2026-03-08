package Arrays.Searching;

import java.util.Arrays;

public class Countrepectvalues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,7,7,8,9};
        Arrays.sort(arr);
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                System.out.print(arr[i-1] + "^" + count + " ");
                count = 1;
            }
        }
        System.out.print(arr[arr.length-1] + " -> " + count);
    }
}