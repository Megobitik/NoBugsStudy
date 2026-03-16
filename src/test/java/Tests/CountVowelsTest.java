package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {
    CountVowelsMethod countV = new CountVowelsMethod();

    @ParameterizedTest
    @ValueSource(strings = {"hello","java"})
    public void countVowelsInWord(String strings){
        assertEquals(2,countV.countVowels(strings));
    }

    @Test
    public void countVowelsWithUpperCase(){
        assertEquals(5,countV.countVowels("AEIOU"));
    }

    @Test
    public void countVowelsWithEmptyString(){
        assertEquals(0,countV.countVowels(""));
    }

    @Test
    public void countVowelsWithoutVovwels(){
        assertEquals(0,countV.countVowels("bcdfg"));
    }

    @Test
    public void countVowelsIsNull(){
        assertEquals(IllegalArgumentException.class,countV.countVowels(null));
    }
}
