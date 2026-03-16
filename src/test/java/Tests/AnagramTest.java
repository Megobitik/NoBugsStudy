package Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AnagramTest {
    Anagram anagram = new Anagram();

    @Test
    public void checkAnagramWithCorrectString(){
        assertTrue(anagram.isAnagram("listen","silent"));
    }

    @Test
    public void checkAnagramWithIncorrectString(){
        assertFalse(anagram.isAnagram("java","python"));
    }

    @Test
    public void checkAnagramWithNull(){
        assertFalse(anagram.isAnagram(null,"word"));
        assertFalse(anagram.isAnagram("null",null));

    }
}
