package Collections.Origin;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetTask2 {

    static void main(String[] args) {

        HashSet<String> set = new HashSet<>(Arrays.asList("url1","url2","url3"));

        int totalCount = 0;
       while (!set.isEmpty()){
           if(set.iterator().hasNext()== true){
               System.out.println(set.iterator().next());
               System.out.println("Size " + set.size());
               set.remove(set.iterator().next());
               totalCount ++;
           }
           System.out.println("TotalCount " +totalCount);
       }
    }
}
