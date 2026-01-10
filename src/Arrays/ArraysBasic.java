package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[4];
        System.out.print("Enter the number:");
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        for (String a:str) {
            System.out.print(a + " ");
        }
        System.out.println(Arrays.toString(str ));
    }
}
//
//l1.forEach(
//(element) -> { System.out.print(element); });