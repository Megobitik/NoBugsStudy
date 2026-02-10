package Collections.PriorityQueue;

import java.util.ArrayDeque;

public class Task1 {
    static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        deque.offer("1");
        deque.offer("2");
        deque.offer("5");

        for (String str:deque){
            System.out.println(str);
        }
    }
}
