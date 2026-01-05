package ConditionalAndLoops.DoWhile;

import java.util.Scanner;

public class CheckNum {
    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void checkNum(){
        do {
            System.out.println("Ввести число:");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Правильное число!");
                break;
            }
        }
            while (number <= 0);
    }

    static void main(String[] args) {
        CheckNum.checkNum();
    }
}
