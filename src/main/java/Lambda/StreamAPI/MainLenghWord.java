package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLenghWord {
    static void main(String[] args) {
        List<String> words = Arrays.asList("Один","Два","Десять");

        List<String> longWords = words.stream().filter(s -> s.length() > 5).collect(Collectors.toList());

        System.out.println("Слова которые больше 5 символов: " + longWords);
    }
}
