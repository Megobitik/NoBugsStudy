package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvaretingInt {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        double avaratingNum = numbers.stream().collect(Collectors.averagingInt(n -> n));

        System.out.println(avaratingNum);
    }
}
