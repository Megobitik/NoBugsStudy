package Collections.ArrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.addLast("3");
        deque.addLast("2");
        deque.addLast("1");

        for (String str : deque){
            System.out.println(str);
        }
        System.out.println(deque);
    }
}
