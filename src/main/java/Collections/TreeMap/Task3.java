package Collections.TreeMap;

import java.util.TreeMap;

public class Task3 {
    static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(100,"alex");
        map.put(200,"Alex");
        map.put(300,"ALEX");

        Integer higherkey = map.higherKey(150);

        System.out.println(higherkey);
    }
}
