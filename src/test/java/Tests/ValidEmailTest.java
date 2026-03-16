package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidEmailTest {
    ValidEmail validEmail = new ValidEmail();

    @Test
    public void checkValidEmail(){
        assertTrue(validEmail.isValidEmail("test@example.com"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com","no-at-symbol","@missing-user.com","user@domain"})
    public void checkUnvalidEmail(String strings){
        assertFalse(validEmail.isValidEmail(strings));
    }

    @Test
    public void checkEmptyEmailValue(){
        assertFalse(validEmail.isValidEmail(""));
    }

    @Test
    public void checkNullEmailValue(){
        assertFalse(validEmail.isValidEmail(null));
    }
}
