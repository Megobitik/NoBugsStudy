package Collections.Origin;

import java.util.HashSet;


public class HashSetTask3 {
    public static int count(String s){

        HashSet<String> set = new HashSet<>();

        String[] word = s.split(" ");

        for (String wor: word){
            set.add(wor);
        }
        return set.size();
    }

    static void main(String[] args) {
        String s = "Hello world NoBugs here";
        System.out.println(count(s));
    }
}
