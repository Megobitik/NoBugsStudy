package ConditionalAndLoops.BreakContinue;

import java.util.Scanner;

public class GreaterThanZero {
    Scanner scanner = new Scanner(System.in);
    boolean logic = true;

    public void greaterZero() {
        while (logic) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Введено отрицательное значение");
                continue;
            } else if (num == 0) {
                System.out.println("Ввели ноль");
                break;
            } else {
                System.out.println("Ввели " + num);
            }
        }
    }

    static void main(String[] args) {
        GreaterThanZero greaterThanZero = new GreaterThanZero();
        greaterThanZero.greaterZero();
    }
}
