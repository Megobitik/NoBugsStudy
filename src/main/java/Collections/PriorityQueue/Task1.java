package Collections.PriorityQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Task1 {
    static void main(String[] args) {
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        priorityQueue.offer(6);

        while (!priorityQueue.isEmpty()){
            Integer newQueu = priorityQueue.poll();
            System.out.println(newQueu);
        }
    }
}
