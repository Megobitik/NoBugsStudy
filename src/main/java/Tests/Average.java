package Tests;

import java.util.Arrays;

public class Average {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
