package Tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthTest {

    StringLengthMapper stringMapper = new StringLengthMapper();

    @Test
    public void checkMapperWithCorrectString(){
        List<String> actual = Arrays.asList("Java","C","Go");
        List<Integer> expect = Arrays.asList(4,1,2);

        assertEquals(expect,stringMapper.mapToLengths(actual));
    }

    @Test
    public void checkMapperWithEmptyString(){
        List<String> actual = Collections.emptyList();
        List<Integer> expect = Collections.emptyList();

        assertEquals(expect,stringMapper.mapToLengths(actual));
    }
}
