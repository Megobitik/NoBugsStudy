package Jenerics;

public class Task2 {

    public <T> void printMsg(T[] array){
        for (T element : array){
            System.out.println(element + " ");
        }
    }

    static void main(String[] args) {
        Task2 task2 = new Task2();

        Integer[] num = {1,2,3,4,5};
        String[] name = {"Alex","Otto","May"};

        task2.printMsg(num);
        task2.printMsg(name);
    }
}
