package Tests;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidJson {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
