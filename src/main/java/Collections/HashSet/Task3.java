package Collections.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public Set<String> removeDuplicate(List<String> input){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(input);

        return hashSet;
    }
}
