package Collections.LinkedHashMap;

import java.util.LinkedHashMap;

public class Task3 {
    static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        map.put("book1","1");
        map.put("book2","2");
        map.put("book3","3");
        map.put("book4","4");
        map.put("book5","5");
        map.put("book6","6");
        map.put("book7","7");
        map.put("book8","8");
        map.put("book9","9");
        map.put("book10","10");
        map.put("book11","11");

        if(map.size()>10){
            String firstE = map.keySet().iterator().next();
            map.remove(firstE);
        }
        System.out.println(map.entrySet());
    }
}
