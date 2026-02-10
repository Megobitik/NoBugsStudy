package Collections.Origin;


import java.util.LinkedList;

//2. Очередь задач для обработки
//Задача:
//Хранить задачи в порядке поступления и обрабатывать по очереди.
public class LinkedListTask {
    static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("task1");
        linkedList.add("task2");
        linkedList.add("task3");

        while (!linkedList.isEmpty()){
            linkedList.pop();
            System.out.println(linkedList);
        }
    }
}
