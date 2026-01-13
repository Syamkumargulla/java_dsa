package Tryy;

import java.util.Arrays;

public class try1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,26,4,5,6,7,7,25,25};

        int l = arr[0];
        int s = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > s && arr[j] != l) {
                s = arr[j];
            }
        }

        System.out.println(s);
    }
}
