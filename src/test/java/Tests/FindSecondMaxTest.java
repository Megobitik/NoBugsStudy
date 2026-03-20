package Tests;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FindSecondMaxTest {

    FindSecondMaxMethod maxMethod = new FindSecondMaxMethod();

    @Test
    public void findMaxCorrectValue(){
        int[] input = {1,2,3,4,5};
        assertEquals(4,maxMethod.findSecondMax(input),"Нет нужного значения");
    }

    @Test
    public void findMaxWithEqualsElement(){
        int[] input = {4,4,4,4};
        assertThrows(IllegalArgumentException.class,() -> maxMethod.findSecondMax(input),"Нет второго максимума");
    }

    @Test
    public void findMaxWithSingleElement(){
        int[] input = {8};
        assertThrows(IllegalArgumentException.class,() -> maxMethod.findSecondMax(input),"Нет второго максимума");
    }

    @Test
    public void findMaxWithEmptyArray(){
        int[] input = {};
        assertThrows(IllegalArgumentException.class,() -> maxMethod.findSecondMax(input),"Нет второго максимума");
    }

}
