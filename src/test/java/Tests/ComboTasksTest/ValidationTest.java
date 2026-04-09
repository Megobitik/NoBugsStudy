package Tests.ComboTasksTest;

import ComboTasks.Validation.InvalidUserException;
import ComboTasks.Validation.User;
import ComboTasks.Validation.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ValidationTest{
    UserValidator userValidator = new UserValidator();

    @BeforeEach
    void setUp(){
        userValidator.setValidation(true);
    }

    @Test
    public void checkValideUser(){
        User user = new User("Alex",20,"Alex@mail.com");

        assertDoesNotThrow(() -> userValidator.validate(user));
    }

    @Test
    public void checkExceptionWithStartLowerCaseName(){
        User user = new User("alex",20,"Alex@mail.com");

        assertThrows(InvalidUserException.class,() -> userValidator.validate(user));
    }

    @Test
    public void checkExceptionWithEmptyName(){
        User user = new User("",20,"Alex@mail.com");
        assertThrows(InvalidUserException.class,() -> userValidator.validate(user));
    }

    @Test
    public void checkExceptionIfAgeBelow18(){
        User user = new User("Alex",17,"Alex@mail.com");
        assertThrows(InvalidUserException.class,() -> userValidator.validate(user));
    }

    @Test
    public void checkExceptionIfAgeAbove100(){
        User user = new User("Alex",101,"Alex@mail.com");
        assertThrows(InvalidUserException.class,() -> userValidator.validate(user));
    }

    @Test
    public void checkBoundaryValueAge(){
        User user1 = new User("Alex",18,"Alex@mail.com");
        User user2 = new User("Alex",100,"Alex@mail.com");

        assertDoesNotThrow(() -> userValidator.validate(user1));
        assertDoesNotThrow(() -> userValidator.validate(user2));

    }

    @Test
    public void checkInvalideEmail(){
        User user1 = new User("Alex",18,"il.com");

        assertThrows(InvalidUserException.class,() -> userValidator.validate(user1));
    }

    @Test
    public void checkToggle(){
        userValidator.setValidation(false);
        User user1 = new User("Al555ex",10,"Alex.com");

        assertDoesNotThrow(() -> userValidator.validate(user1));
    }
}
