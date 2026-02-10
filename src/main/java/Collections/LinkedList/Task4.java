package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Task4 {
    static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1,2,5,7,10));

        int sum = 0;

        for(int sumInt:integerList){
            sum += sumInt;
        }
        System.out.println(sum);
    }
}
