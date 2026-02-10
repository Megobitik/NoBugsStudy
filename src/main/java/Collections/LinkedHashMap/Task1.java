package Collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    static void main(String[] args) {
        LinkedHashMap<String,Integer>  linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Alex",7);
        linkedHashMap.put("Alex1",8);
        linkedHashMap.put("Alex",8);

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry);
        }
    }
}
