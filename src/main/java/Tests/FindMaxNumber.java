package Tests;

import java.util.Arrays;

public class FindMaxNumber {
    public int findMax(int[] numbers) {
        if (numbers == null){
            throw new IllegalArgumentException();
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
