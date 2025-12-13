package Arrays;

public class Secondddddkarge {
    public static void main(String[] args) {
        int[] arr = {1,9,8,3,7,2,4,5};
        int large = arr[0];
        int sec = -1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > large){
                sec = large;
                large = arr[i];
            }
        else if  (arr[i] > sec && arr[i] != large) {
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
