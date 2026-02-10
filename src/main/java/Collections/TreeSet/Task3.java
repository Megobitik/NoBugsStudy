package Collections.TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Task3 {
    static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10,20,30,40));

        int value = 25;

        Integer highV = treeSet.higher(value);
        Integer lowerV = treeSet.lower(value);

        System.out.println(highV + "High");
        System.out.println(lowerV + "lower");

    }
}
