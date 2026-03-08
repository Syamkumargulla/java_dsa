package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arry1 {
    //list quue set
//list = arraylist , linked list,stack
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> last = new ArrayList<>();
        last.add(19);
        last.add(20);
        last.contains(1);
        last.set(0,22);
        //last.remove(0,1);
        System.out.println(last);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
           // last.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              //  last.get(i).add(sc.nextInt());
            }
        }

    }
}
