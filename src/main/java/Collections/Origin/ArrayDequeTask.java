package Collections.Origin;

import java.util.ArrayDeque;

public class ArrayDequeTask {
    static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(1);

        System.out.println(deque);

        while (!deque.isEmpty()){
            System.out.println(deque);
            deque.pop();
        }
    }
}
