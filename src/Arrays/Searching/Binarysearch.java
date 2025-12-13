package Arrays.Searching;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,5,6,7,8,9};
        int target = 5;
        int ans =  Search(arr, target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
     int s = 0;
     int e = arr.length-1;
     while (s<e){
       int mid = (s+e)/2;
       if (target < arr[mid])e = mid-1;
       else if (arr[mid] < target)s = mid+1; else return mid; }
     return -1;
    }
}
