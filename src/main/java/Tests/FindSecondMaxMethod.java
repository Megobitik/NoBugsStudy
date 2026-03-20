package Tests;

import java.util.Arrays;

public class FindSecondMaxMethod {
    public int findSecondMax(int[] numbers) {
        int[] uniqueSorted = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .toArray();

        if (uniqueSorted.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать хотя бы два различных числа");
        }

        return uniqueSorted[uniqueSorted.length - 2];
    }
}
