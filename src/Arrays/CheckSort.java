package Arrays;

public class CheckSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,0};
         int e = array.length;
         boolean sort = true;
        for (int i = 1; i < e ; i++) {
            if(array[i] < array[i-1]){
                sort = false;
            }

        }
        System.out.println(sort);
    }
}
