package Collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("team1", 300);
        map.put("ajax", 900);
        map.put("team2", 700);
        map.put("team1", 600);


        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
