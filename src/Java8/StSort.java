package Java8;

import java.util.List;

public class StSort {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5,2,8,1,3);
        numbers.stream()
                .sorted()
                .forEach(System.out::print);
    }
}
