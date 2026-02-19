package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GropuBy {

    static void main(String[] args) {

        List<String> words = Arrays.asList("Помидор","Понедельник","победа","Среда","Кошка");

        Map<Character, List<String>> wordGroup = words.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(wordGroup);
    }
}
