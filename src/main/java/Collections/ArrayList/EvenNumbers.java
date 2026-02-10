package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EvenNumbers {
    static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Iterator<Integer> iterator = array.iterator();

        while (iterator.hasNext()){
            Integer number = iterator.next();
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
