package Newmay;

import java.util.Arrays;

public class Missingvalue {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        int ans = 0;
        for (int i : arr) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] == i ){
                    break;
                }else {
                    ans = i;

                }

            }

        }
      System.out.println(ans);
    }
}
