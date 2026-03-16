package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ValidJsonTest {

    ValidJson validJson = new ValidJson();

    @Test
    public void checkValidJson(){
        String string =  "\"{\"key\":\"value\"}\"";
        assertTrue(validJson.isValidJson(string));
    }

    @Test
    public void checkInvalidJson(){
        assertFalse(validJson.isValidJson("invalid json"));
    }

    @Test
    public void checkInvalidJsonWithNull(){
        assertFalse(validJson.isValidJson(null));
    }
}
