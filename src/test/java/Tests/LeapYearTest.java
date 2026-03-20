package Tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {2000,2020,1600,0,4,400})
    public void leapYearTest(int ints){
        assertTrue(leapYear.isLeapYear(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {2019,2021,2022,1900,2100})
    public void notLeapYearTest(int ints){
        assertFalse(leapYear.isLeapYear(ints));
    }
}
