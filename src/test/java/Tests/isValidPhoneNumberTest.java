package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isValidPhoneNumberTest {

    ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890","+44 9876543210","+999 1111111111"})
    public void checkCorrectPhoneNumber(String strings){
        assertTrue(validPhoneNumber.isValidPhoneNumber(strings));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345","invalid","+1 abcdefghij","+1234 1234567890","+1 123",""})
    public void incorrectPhoneNumber(String strings){
        assertFalse(validPhoneNumber.isValidPhoneNumber(strings));
    }

    @Test
    public void exceptionPhoneNumber(){
        assertThrows(IllegalArgumentException.class,() -> validPhoneNumber.isValidPhoneNumber(null));
    }
}
