package Lambda.FuncInterface;

import java.util.function.Predicate;

public class MainPredicate {
    static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;

        int number1 = 5;
        int number2 = 2;

        System.out.println(predicate.test(number1));
        System.out.println(predicate.test(number2));
    }
}
