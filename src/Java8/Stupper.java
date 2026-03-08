package Java8;

import java.util.List;
import java.util.Locale;

public class Stupper {
    public static void main(String[] args) {
        List<String> names = List.of("syam","ram","krishna");
        names.stream().map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
