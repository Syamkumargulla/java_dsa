package Arrays;

import java.util.Arrays;

public class Towsearch {
    public static void main(String[] args) {
        int[][] arr = {
                {22,4,5},
                {33,6,7},
                {44,8,9}
        };
        int target = 33;
        int[] ans = serach(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] serach(int[][] arr , int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == target){
                    return  new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
