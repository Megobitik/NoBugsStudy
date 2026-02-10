package Collections.Origin;

import java.util.HashMap;

public class HashMapTask2 {
    static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Иван", "89112223344");
        map.put("Алекс", "89112223355");

        if(map.containsKey("Иван")){
            System.out.println(map.get("Иван"));
        }
    }
}
