package Collections.ArrayDeque;

import java.util.ArrayDeque;

public class Task3 {
    static void main(String[] args) {
        ArrayDeque <Integer> deque = new ArrayDeque<>();

        deque.addFirst(5);
        deque.addFirst(6);
        deque.addLast(1);
        deque.addLast(2);
        deque.addFirst(3);


        while (!deque.isEmpty()){
            deque.removeFirst();
            System.out.println(deque);
        }
        // тут Exception
//        for (int num:deque){
//            deque.removeLast();
//            System.out.println(num);
//        }

    }
}
