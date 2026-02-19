package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainNumber {
    static void main(String[] args) {

        List<Integer> number = Arrays.asList(5,10,15,22,25);

        List<Integer> numberCount = number.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());

        System.out.println("Эти числа деляться на 5 без остатка: " + numberCount);
    }
}
