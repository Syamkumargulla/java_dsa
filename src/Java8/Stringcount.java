package Java8;

import java.util.Map;
import java.util.stream.*;

public class Stringcount {
    public static void main(String[] args) {
        String word = "banana";
        Map<Character, Long> result =
                word.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.counting() ));
        System.out.println(result);
    }
}
