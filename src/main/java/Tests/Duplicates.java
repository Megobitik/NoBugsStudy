package Tests;

import java.util.Arrays;

public class Duplicates{
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
        }
}
