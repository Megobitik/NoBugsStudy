package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    static void main(String[] args) {

        HashMap<String,Integer> human = new HashMap<>();

        human.put("Alex",30);
        human.put("Olga",24);
        human.put("Goga",15);

        for (Map.Entry<String,Integer> entry : human.entrySet()){
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("Name: "+name + ", age: "+age);
        }
    }
}
