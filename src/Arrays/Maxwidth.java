package Arrays;

public class Maxwidth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5} };
        int a = max(arr);
        System.out.println(a);
    }
    public static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

