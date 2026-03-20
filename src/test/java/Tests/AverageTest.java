package Tests;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AverageTest {

    Average average = new Average();

    @Test
    public void checkAverageWithVorrectNumber(){
        int[] actual = {1,2,3,4,5};
        double expect = 3.0;

        assertEquals(expect,average.findAverage(actual));
    }

    @Test
    public void checkEqualsNumber(){
        int[] actual = {10};
        double expect = 10.0;

        assertEquals(expect,average.findAverage(actual));
    }

    @Test
    public void checkEmptyArray(){
        int[] actual = {};
        assertThrows(NoSuchElementException.class,() -> average.findAverage(actual));
    }

    @Test
    public void checkNullArray(){
        int[] actual = null;
        assertThrows(NullPointerException.class,() -> average.findAverage(actual));
    }
}
