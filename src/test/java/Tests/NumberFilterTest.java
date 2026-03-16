package Tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFilterTest {

    NumberFilter numberFilter = new NumberFilter();

    @Test
    public void checkMixedNumbers(){
        List<Integer> actual = Arrays.asList(1,2,3,4,5);
        List<Integer> expect = Arrays.asList(2,4);

        assertEquals(expect,numberFilter.filterEvenNumbers(actual));
    }

    @Test
    public void checkWithoutEvenNumbers(){
        List<Integer> actual = Arrays.asList(1,3,5);
        List<Integer> expect = Collections.emptyList();

        assertEquals(expect,numberFilter.filterEvenNumbers(actual));
    }

    @Test
    public void ckeckEmptyInput(){
        List<Integer> actual = Collections.emptyList();
        List<Integer> expect = Collections.emptyList();

        assertEquals(expect,numberFilter.filterEvenNumbers(actual));
    }
}
