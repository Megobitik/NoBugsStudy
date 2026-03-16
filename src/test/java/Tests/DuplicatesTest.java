package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicatesTest {
    Duplicates duplicates = new Duplicates();

    @Test
    public void checkWithoutDuplicates(){
        int[] ints = {1,2,3,4,5};
        assertFalse(duplicates.hasDuplicates(ints));
    }

    @Test
    public void checkWithDuplicates(){
        int[] ints = {1,2,2,3};
        assertTrue(duplicates.hasDuplicates(ints));
    }

    @Test
    public void checkDuplicatesWithEmptyValue(){
        int[] ints = {};
        assertFalse(duplicates.hasDuplicates(ints));
    }
}
