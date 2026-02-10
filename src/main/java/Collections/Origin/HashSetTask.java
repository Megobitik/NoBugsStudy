package Collections.Origin;
import java.util.HashSet;
//    1. Хранение уникальных идентификаторов пользователей
//    Задача:
//    Проверить, есть ли пользователь с заданным ID.
public class HashSetTask {
    static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");

        System.out.println(set.contains("1"));
        System.out.println(set.contains("2"));
        System.out.println(set.contains("3"));
        System.out.println(set.contains("4"));
    }
}
