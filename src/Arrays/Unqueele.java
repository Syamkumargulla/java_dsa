package Arrays;

import java.util.*;

public class Unqueele {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7};
        //Output: [1, 2, 3, 4, 5, 7]
        HashSet<Integer> set = new HashSet<>();
        for (int i:arr1) {
            set.add(i);
        }
        for (int i:arr2) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int x : set) {
            result[i] = x;
            i++;
        }
        Arrays.sort(result);
//Object[] unqe = set.toArray();
       // set.forEach((s) -> {System.out.print(s);});
        System.out.println(Arrays.toString(result));
    }


}
