package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task5 {
    static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("String1","String2","String3"));
        ListIterator<String> it = linkedList.listIterator();


        while(it.hasNext()){
            String reult = it.next();
            System.out.println(reult);
        }
        System.out.println();

        while(it.hasPrevious()){
            String reult = it.previous();
            System.out.println(reult);
        }
    }
}
