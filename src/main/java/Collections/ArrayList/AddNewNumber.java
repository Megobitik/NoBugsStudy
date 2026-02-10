package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNewNumber {
    static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        array.add(6);

        System.out.println(array);

    }
}
