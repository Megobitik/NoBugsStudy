package Lambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class rconvertStringToInt {
    static void main(String[] args) {
        List<String> strings = Arrays.asList("пять","восемь","десять");

        List<Integer> lengh = strings.stream().map(s -> s.length()).collect(Collectors.toList());

        System.out.println("Эти слова "+ strings + " , занимают " + lengh + " символов");
    }

}
