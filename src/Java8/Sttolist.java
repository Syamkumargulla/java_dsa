package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Sttolist {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,15,25,3,12);

        List<Integer> result = numbers.stream().filter(n -> n>3)
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
