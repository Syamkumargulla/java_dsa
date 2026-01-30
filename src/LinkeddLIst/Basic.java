package LinkeddLIst;
import  java.util.*;
public class Basic {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Syam");
        names.add("Kumar");
        names.add("Java");
        names.remove(2);
        names.remove(String.valueOf("Kumar"));
        System.out.println(names);
    }
}
