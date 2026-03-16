package Tests;

public class CountWordsMethod {
    public int countWords(String sentence) {
        if(sentence == null){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
