package Collections.HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Task2 {
    static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);

        if(hashSet.contains(5)){
            System.out.println("5");
        }
        if (hashSet.contains(1)) {
            System.out.println("1");
        }
        else {
            System.out.println("Ничего");
        }
    }
}
