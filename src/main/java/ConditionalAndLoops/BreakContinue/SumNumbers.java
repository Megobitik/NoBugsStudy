package ConditionalAndLoops.BreakContinue;

import java.util.Scanner;

public class SumNumbers {
    Scanner scanner = new Scanner(System.in);
    int sum;

    public int sumNumber(){
        while (true) {
            System.out.println("Введите положительное число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("введено отрицательное число");
                break;
            }
            else {
                sum = sum + number;
                System.out.println("Итого: " + sum);
            }
        }
        return sum;
    }

    static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.sumNumber();
    }
}
