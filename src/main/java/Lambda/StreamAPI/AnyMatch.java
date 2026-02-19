package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(13);

        boolean matchNum = numbers.stream().anyMatch(n -> n % 2 == 0);

        System.out.println(matchNum);
    }
}
