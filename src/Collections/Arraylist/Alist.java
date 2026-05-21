package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Alist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList< Integer> l1 = new ArrayList<>(10);
     //  var l2 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(2);

        ArrayList<ArrayList <Integer>> l2 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            l2.add(new ArrayList<>());
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                l2.get(i).add(sc.nextInt());
            }
        }

        System.out.print(l2);
    }
}
