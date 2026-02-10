package Collections.LinkedList;

import java.util.LinkedList;

public class Task2 {
    static void main(String[] args) {

        LinkedList<String> taskList = new LinkedList<>();

        taskList.add("task1");
        taskList.add("task2");
        taskList.add("task3");
        taskList.add("task4");

        while (!taskList.isEmpty()){
            taskList.removeFirst();
          //taskList.poll();
            System.out.println(taskList);
        }

    }
}
