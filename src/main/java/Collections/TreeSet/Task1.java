package Collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
    static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println(treeSet);

        Iterator<Integer> interable = treeSet.iterator();

        while (interable.hasNext()){
            System.out.println(interable.next());
        }
    }
}
