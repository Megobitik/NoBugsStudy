package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumbersTest {
    EvenNumbers evenNumbers = new EvenNumbers();

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,-1,-2,-3,-4})
    public void checkEvenNumbers(int ints){
        assertTrue(evenNumbers.isEven(ints),
                "Число не делится на 2 без остатка, значит, оно нечётное.");
        System.out.println("Число делится на 2 без остатка, значит, оно чётное.");
    }

    @Test
    public void checkEvenNumbersIfValueEqualsZero(){
        assertTrue(evenNumbers.isEven(0),
                "Ноль. Число не делится на 2 без остатка, значит, оно нечётное.");
        System.out.println("Ноль — чётное число, так как он делится на 2.");
    }
}
