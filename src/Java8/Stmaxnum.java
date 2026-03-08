package Java8;
import java.util.*;
public class Stmaxnum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,5,40,15);
       int max =  numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
