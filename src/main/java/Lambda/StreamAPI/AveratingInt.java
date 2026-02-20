package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveratingInt {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        double averatingNum = numbers.stream().collect(Collectors.averagingInt(n -> n));

        System.out.println(averatingNum);
    }
}
