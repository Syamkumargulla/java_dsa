package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Dupilcate {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,1,8,6,9,7,6);
      List<Integer> n =  num.stream().sorted().distinct()
                .collect(Collectors.toList());
      System.out.print(n);
    }
}
