package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxInt {
    static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));

        int max = Collections.max(array);
        System.out.println("Через collections " + max);


        int maxInt = array.get(0);

        for(int num:array){
            if (num > maxInt){
                maxInt = num;
            }
        }
        System.out.println("Руками: " + maxInt);
    }
}
