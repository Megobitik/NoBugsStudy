package Collections.Origin;

import java.util.HashMap;

public class HashMapTask {
    static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Key1","Value1");
        map.put("Key2","Value2");
        map.put("Key3","Value1");
        map.put("Key1","Value4");

        while (!map.isEmpty()){
            String key = map.keySet().iterator().next();
            String value = map.get(key);
            System.out.println(value);
            map.remove(key);
        }
    }
}
