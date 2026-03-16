package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPasswordTest {

    ValidPassword validPassword = new ValidPassword();

    @Test
    public void checkValidePasswordWithCorrectInput(){
        assertTrue(validPassword.isValidPassword("Password1"));
    }

    @Test
    public void checkValidePasswordWithIncorrectInput(){
        assertFalse(validPassword.isValidPassword("pass"));
    }

    @Test
    public void checkValidePasswordWithNullInput(){
        assertFalse(validPassword.isValidPassword(null));
    }
}
