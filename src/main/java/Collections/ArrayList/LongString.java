package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LongString {
    static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("No","Bugs"));
        array.add("Nobugs");

        Integer max = 0;
        String maxString = "";

        for (String str:array){
            if(str.length()>max){
                max = str.length();
                maxString = str;
            }
        }
        System.out.println(maxString);
    }
}
