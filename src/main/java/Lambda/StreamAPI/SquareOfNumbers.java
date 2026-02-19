package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,8,10);

        List<Integer> squareNum = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(squareNum);
    }
}
