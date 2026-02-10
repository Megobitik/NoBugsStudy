package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("NoBugs");
        stringList.add("NoNoBugs");
        stringList.add("Bugs");

        for(String str:stringList){
            System.out.println(str);
        }

        System.out.println("Почему массив?" + stringList);

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
