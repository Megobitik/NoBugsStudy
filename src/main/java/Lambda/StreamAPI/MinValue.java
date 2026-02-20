package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinValue {
    static void main(String[] args) {

        List<Integer> value = Arrays.asList(1,2,3,4,5);

        Optional<Integer> minNumber = value.stream().min(Comparator.naturalOrder());

        String result = minNumber.map(n ->"почему тут без строки не работает? " + n).orElse("Нет минимального");
        System.out.println(result);
    }
}
