package Java8;

import java.util.List;

public class St {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,8,9);
        num.stream()
                .filter(n -> n %2 ==0)
                .forEach(System.out::print);
    }
}
