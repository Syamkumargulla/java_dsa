package oops;
import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.forEach(x -> System.out.println(x));


        ListIterator<String> it = list.listIterator();

        while(it.hasNext()) {
            String lang = it.next();
            if(lang.equals("Python")) {
                it.set("JavaScript"); // replace
            }
        }

        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }


        System.out.println(list);
    }
}
