package Collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class Task1 {
    static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("string1");
        linkedHashSet.add("string2");
        linkedHashSet.add("string3");

        //System.out.println(linkedHashSet);

        for(String str:linkedHashSet){
            System.out.println(str);
        }
    }
}
