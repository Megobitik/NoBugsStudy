package Collections.ArrayDeque;

import java.util.ArrayDeque;

public class Task2 {
    static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);

        while (!deque.isEmpty()){
            deque.pop();
            System.out.println(deque);
        }
    }
}
