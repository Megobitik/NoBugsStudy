package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    public static Stream<Arguments> valuesForReverse(){
        return Stream.of(
                Arguments.of("hello","olleh"),
                Arguments.of("java", "avaj"),
                Arguments.of("",""),
                Arguments.of("a","a")

        );
    }
    @ParameterizedTest
    @MethodSource("valuesForReverse")
    public void checkReverseString(String actual, String expected){
        String stringReverse = reverseString.reverse(actual);
        assertEquals(expected, stringReverse,"Строка не перевернулась");
    }

    @Test
    public void checkReverseStringWithNullValue(){
        assertNull(reverseString.reverse(null));
    }
}
