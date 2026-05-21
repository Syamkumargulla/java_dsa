import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Size of Array:");
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        System.out.print("ener he elements:");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int[] b : arr){
            System.out.println(Arrays.toString(b));
        }

    }
}