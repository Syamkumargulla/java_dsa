package Arrays;


public class Secondlrg {
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,9,3,8,6};
        int n = arr.length;
        int larg = arr[0];
        int sec = -1;
        for (int i = 1; i <n ; i++) {
            if(arr[i] > larg) larg = arr[i];
        }
        System.out.println(larg);
        for (int j = 0; j < n; j++) {
            if(  arr[j] > sec &&  arr[j] != larg){
                sec = arr[j];
            }
        }
        System.out.println(sec);
    }
}
