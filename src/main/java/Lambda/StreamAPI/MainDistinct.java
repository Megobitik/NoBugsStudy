package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDistinct {
    static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1,2,3,2,2,4,5,6,7,7,8,9);

        List<Integer> distinctIntegers = integers.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctIntegers);
    }
}
