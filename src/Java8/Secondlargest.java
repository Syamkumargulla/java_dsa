package Java8;

import java.util.Comparator;
import java.util.List;

public class Secondlargest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,5,30,40,30);
        int second = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.print(second);

    }
}
