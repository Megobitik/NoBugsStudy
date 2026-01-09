package ConditionalAndLoops.DoWhile;

import java.util.Scanner;

public class DoExit {

    Scanner scanner = new Scanner(System.in);
    String input;

    public String doExit(){
        do {
            System.out.println("ведите команду на латинице:");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                System.out.println(input + " Неправильная команда");
            }
            else {
                System.out.println(input + " Правильная команда");
            }
        }while(!input.equals("exit"));
        return input;
    }

    static void main(String[] args) {
        DoExit doExit = new DoExit();
        doExit.doExit();
    }
}
