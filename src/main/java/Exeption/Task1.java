package Exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
