package Arrays;

import java.util.Arrays;

public class Kro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int  n = arr.length;
        int k =3;
        int[] temp = new  int[k];
        for (int i  = 0; i <k  ; i++) {
           temp[i] = arr[i];
        }
        int y =0;
        for (int j = k; j < n ; j++) {
            arr[y] = arr[j];
            y++;
        }

        for (int h = n-k; h <n ; h++) {
            arr[h] = temp[h-(n-k)];

        }
        System.out.println(Arrays.toString(arr));
    }
}
