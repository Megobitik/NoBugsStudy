package Collections.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    static void main() {

        LinkedList<String> longString = new LinkedList<>(Arrays.asList("dada", "fdfaf", "Nobuuuuuuugs"));

        Iterator<String> iterator = longString.iterator();

        if (!longString.isEmpty()){
             String first = longString.getFirst();
             String last = longString.getLast();

            System.out.println(first);
            System.out.println(last);
        }


    }
}