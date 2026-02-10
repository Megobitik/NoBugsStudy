package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public void printUnderage(Map<String,Integer> map){

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()<18){
                System.out.println(entry.getKey());
            }
            else {
                System.out.println("Взрослый");
            }
        }
    }

    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Alex",11);
        map.put("Alex2",12);
        map.put("Alex3",13);
        map.put("Ale4",19);
        map.put("Ale5",18);
        map.put("Ale6",21);

        Task3 task3 = new Task3();
        task3.printUnderage(map);
    }
}
