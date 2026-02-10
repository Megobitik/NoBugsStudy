package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SumNum {
    static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int sum = 0;

        for(int num:array){
            sum += num;
        }
        System.out.println(sum);
    }
}
