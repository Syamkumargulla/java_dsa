package Java8;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 15, 25, 3, 12);
        long count = numbers.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(count);
    }
}
