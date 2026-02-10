package Collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class Task2 {

    void addUnique(LinkedHashSet<String> set, String element){
        if (!set.contains(element)){
            set.add(element);
        }
    }
}
