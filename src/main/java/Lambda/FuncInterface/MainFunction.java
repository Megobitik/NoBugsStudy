package Lambda.FuncInterface;

import java.util.function.Function;

public class MainFunction {
    static void main(String[] args) {
        Function<String,Integer> function = s -> s.length();

        System.out.println(function.apply("Текст"));
        System.out.println(function.apply("Нужный Текст"));
    }
}
