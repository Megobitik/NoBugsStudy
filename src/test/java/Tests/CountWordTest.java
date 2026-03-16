package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordTest {
    CountWordsMethod countWord = new CountWordsMethod();

    @Test
    public void countWordWithCorrectInput(){
        assertEquals(2,countWord.countWords("Hello world"));
    }

    @Test
    public void countWordWithEmptyInput(){
        assertEquals(0,countWord.countWords(""),"пустая строка");
    }

    @Test
    public void countWordWithSpacesInput(){
        assertEquals(0,countWord.countWords("  "),"трока с пробелами");
    }

    @Test
    public void countWordWithNullInput(){
        assertThrows(IllegalArgumentException.class,() -> countWord.countWords(null),"передали null");
    }
}
