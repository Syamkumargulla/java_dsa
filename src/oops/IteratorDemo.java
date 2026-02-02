package oops;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            int x = it.next();

            if(x == 20) {
                it.remove(); // ✅ safe removal
            }
        }

        System.out.println(list);
    }
}
