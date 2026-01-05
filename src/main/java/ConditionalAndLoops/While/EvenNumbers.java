package ConditionalAndLoops.While;

import java.util.Scanner;

public class EvenNumbers {
    static int i = 1;
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();

    public static int evenNumber() {
        if (n > 0) {
            while (i <= n) {
                if (i % 2 == 0) {
                    System.out.println("Наше число: " + i);
                }
                i++;
            }
        }
        else {
            System.out.println("Число " + n + " меньше 0");
        }
        return i;
    }

    static void main(String[] args) {
        EvenNumbers.evenNumber();
    }
}
