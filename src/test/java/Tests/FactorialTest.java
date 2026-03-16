package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    FactorialMethod factorialMethod = new FactorialMethod();

    @ParameterizedTest
    @ValueSource(ints = {0,1})
    public void factorialOfZero(int ints){
        assertEquals(1,factorialMethod.factorial(ints),"Должно быть равно 1");
    }

    @Test
    public void factorialOfFive(){
        assertEquals(120,factorialMethod.factorial(5),"Должно быть равно 120");
    }

    @Test
    public void factorialOfSeven(){
        assertEquals(5040,factorialMethod.factorial(7),"Должно быть равно 5040");
    }

    @Test
    public void factorialWithException(){
        assertThrows(IllegalArgumentException.class,() -> factorialMethod.factorial(-3),
                "Отрицательные значения вызывают IllegalArgumentException");
    }
}
