package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxNumberTest {

    FindMaxNumber findMaxNumber = new FindMaxNumber();

    private static Stream<Arguments> value(){
        return Stream.of(
        Arguments.of(new int[]{3,5,7,2},7),
        Arguments.of(new int[]{11},11),
        Arguments.of(new int[]{-1,-2,-3},-1)
                );
    }

    @ParameterizedTest
    @MethodSource("value")
    public void findMaxValue(int[] num, int expectNum) {
        assertEquals(expectNum,findMaxNumber.findMax(num));
    }

    @Test
    public void findMaxValueWithEmptyException(){
        int[] emptyArray = {};
        assertThrows(NoSuchElementException.class,()-> findMaxNumber.findMax(emptyArray));
    }

    @Test
    public void findMaxValueWithNullException(){
        int[] nullArray = null;
        assertThrows(IllegalArgumentException.class, () -> findMaxNumber.findMax(nullArray));
    }
}
