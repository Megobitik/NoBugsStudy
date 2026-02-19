package Lambda.FuncInterface;

import java.util.function.Consumer;

public class MainConsumer {
    static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Привет мир");
    }
}
