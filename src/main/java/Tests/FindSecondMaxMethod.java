package Tests;

import java.util.Arrays;

public class FindSecondMaxMethod {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
