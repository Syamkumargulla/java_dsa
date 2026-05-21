package Newmay;

import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter then number:");
        int  a = sc.nextInt();
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
