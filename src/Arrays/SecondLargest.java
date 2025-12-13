package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SecondLargest {
    public static void main(String[] args) {
        int[]  arr = {2,4,5,6,7,7,8,8,9,9,3};
        Arrays.sort(arr);
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>(n);
        for (int i = 0; i <n ; i++) {
            set.add(arr[i]);

        }

      //  System.out.println(set.size()-1);
        Object[] arrr = set.toArray();
        System.out.println(arrr[arrr.length-2]);
        /*
        int n = arr.length;
        int largest =  arr[n-1];
        for(int i = n-2; i >=0;i--){
            if(arr[i] != largest){
                System.out.print(arr[i]);
                break;
            }
        }

         */
    }
}
