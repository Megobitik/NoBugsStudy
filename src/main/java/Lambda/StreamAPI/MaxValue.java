package Lambda.StreamAPI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class MaxValue {
    static void main(String[] args) {

        List<Integer> value = Arrays.asList(1,2,3,4,5);

        Optional<Integer> maxNumber = value.stream().max(Comparator.naturalOrder());

        System.out.println(maxNumber.get());
    }
}
