package Strings;

import java.util.Arrays;

public class CountString {
    public static void main(String[] args) {
        String s = "syaamkumar";
        char[] arr = s.toCharArray();
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
