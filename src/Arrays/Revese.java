package Arrays;

import java.util.Arrays;

public class Revese {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int s = 0, e = array.length - 1;
        while (s < e) {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            s++;
            e--;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
     }
    }
