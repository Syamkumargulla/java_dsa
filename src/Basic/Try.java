package Basic;

public class Try {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9};
        int k = 6;
        int l = arr.length;
        int ans  = Search(arr ,0 ,l,  k);
        System.out.println(ans);

    }
    public static int Search(int[] arr ,  int s , int e , int k ) {
        if( s > e ) return -1;
        int mid  = (s + e)/2;
        if(arr[mid] == k) return  mid;
        if(arr[mid] < k)  return Search(arr, mid+1 , e , k );
        if(arr[mid] > k)  return Search(arr, s , mid-1 , k );
        return -1;
    }

}
