package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Removedulicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,5,7,2,3};
        Arrays.sort(arr);
      //  Arrays.stream(arr).distinct().forEach(System.out::print);
        int n = arr.length;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nLength = " + (i + 1));
    }
}






 /*  HashSet<Integer> set = new HashSet<>(arr.length);
        for (int i:arr) {
            set.add(arr[i]);
        }
        //Object[] ar = set.toArray(); optional
        set.forEach((s) -> {System.out.print(s);}); */