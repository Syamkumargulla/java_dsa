package Arrays.Searching;

public class Bsearch {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,5,6,7,8,9};
        int target = 5;
        int ans =  Search(arr,0,arr.length-1, target);
        System.out.println(ans);
    }
    public static int Search(int[] arr, int s ,int e , int target){
        if(arr.length == 1) return -1;
        int mid  = s + (e-s)/2;
        if(arr[mid] == target) return  mid;
        else if(arr[mid] < target)return Search( arr , mid + 1, e ,target );
        else return Search( arr , s, mid-1 ,target );
    }

}
