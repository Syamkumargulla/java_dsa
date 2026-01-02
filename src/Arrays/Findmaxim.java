package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Findmaxim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int  size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("enter the elements in array:");
        for (int i = 0; i <size ; i++) {
            array[i] = sc.nextInt();
        }
      // for (int num :array){ System.out.print(num);}
        System.out.println(Arrays.toString(array));
        int maxmum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxmum) {
                maxmum = array[i];
            }
        }
        System.out.println(  " maxmum number" + maxmum);
    }
}
