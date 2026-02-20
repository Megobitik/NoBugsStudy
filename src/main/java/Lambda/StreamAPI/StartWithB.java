package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StartWithB {
    static void main(String[] args) {

        List<String> words = Arrays.asList("Буханка","Батон","Хлебушек","Пироженка");

        Optional<String> startWithB = words.stream().filter(s -> s.startsWith("Б")).findFirst();

        System.out.println(startWithB.orElse("не найдено"));
    }
}
