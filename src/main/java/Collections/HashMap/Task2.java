package Collections.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {

        HashMap<String,Integer> human = new HashMap<>();
        human.put("Alex", 30);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Имя");
        String name = scanner.nextLine();

        System.out.println("Введите возраст");
        Integer age = scanner.nextInt();

        human.put(name,age);

        if(human.containsKey("Alex")||human.containsKey("Kate")){
            System.out.println(human.values());
        }
        else {
            System.out.println("Не найдено");
        }
    }
}
