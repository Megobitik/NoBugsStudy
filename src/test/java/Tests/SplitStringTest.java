package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SplitStringTest {

    SplitStrings splitStrings = new SplitStrings();

    @Test
    public void checkSplitStringWithCorrectString(){
        String actual = "Java,Python,C++";
        String delimiter = ",";
        String[] expect = {"Java", "Python", "C++"};

        assertArrayEquals(expect,splitStrings.splitString(actual,delimiter));
    }

    @Test
    public void checkSplitStringWithEmptyString(){
        String actual = "";
        String delimiter = ",";
        String[] expect = {""};

        assertArrayEquals(expect,splitStrings.splitString(actual,delimiter));
    }

    @Test
    public void checkSplitStringWithOneWordString(){
        String actual = "word";
        String delimiter = ",";
        String[] expect = {"word"};

        assertArrayEquals(expect,splitStrings.splitString(actual,delimiter));
    }

    @Test
    public void checkSplitStringWithNullString(){
        String actual = null;
        String delimiter = ",";
        String[] expect = null;

        assertThrows(NullPointerException.class,() -> splitStrings.splitString(actual,delimiter));
    }

}
