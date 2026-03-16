package Tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortStringsTest {
    SortStrings sortStrings = new SortStrings();

    @Test
    public void checkCorrectStrings(){
        List<String> actual = Arrays.asList("Java", "C", "Python");
        List<String> expect = Arrays.asList("C", "Java", "Python");

        assertEquals(expect,sortStrings.sortByLength(actual));
    }

    @Test
    public void checkEqualsStrings(){
        List<String> actual = Arrays.asList("aa","bb","cc");
        List<String> expect = Arrays.asList("aa","bb","cc");

        assertEquals(expect,sortStrings.sortByLength(actual));
    }

    @Test
    public void checkEmptyString(){
        List<String> actual = Collections.emptyList();
        List<String> expect = Collections.emptyList();

        assertEquals(expect,sortStrings.sortByLength(actual));
    }
}
