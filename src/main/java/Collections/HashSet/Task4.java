package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Task4 {
    static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Alex");
        set.add("Kate");
        set.add("Yula");

        if(set.contains("Alex1")){
            System.out.println("Имя найдено");
        }
        else {
            System.out.println("Имя не найдено");
        }
    }
}
