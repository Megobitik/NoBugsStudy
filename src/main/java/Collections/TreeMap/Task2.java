package Collections.TreeMap;

import java.util.Arrays;
import java.util.TreeMap;

public class Task2 {
    static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1,"num1");
        map.put(2,"num2");
        map.put(3,"num3");
        map.put(2,"num4");

        Integer firstKey = map.firstKey();
        Integer lastKey = map.lastKey();

        System.out.println("первый ключ: " + firstKey + " второй ключ " + lastKey);
    }
}
