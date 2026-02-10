package Collections.LinkedHashMap;

import java.util.LinkedHashMap;

public class Task2 {
    public static void searchContact(LinkedHashMap<String,String> book, String name){
        if(book.containsKey(name)){
            String number = book.get(name);
            System.out.println("Контакт найден");
        }
        else {
            System.out.println("Контакт не найден");
        }
    }

    static void main(String[] args) {
        LinkedHashMap<String,String> books = new LinkedHashMap<>();

        books.put("Alex" , "+7");
        books.put("Alex1" , "+8");
        books.put("Alex" , "+9");

        searchContact(books,"Alex");
        searchContact(books,"Alex1");
        searchContact(books,"Alex2");
    }
}
