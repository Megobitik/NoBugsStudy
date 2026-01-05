package ConditionalAndLoops.DoWhile;

import java.util.Scanner;

public class CountNumber {
    Scanner scanner = new Scanner(System.in);
    int count;
    int number;

    public int countNumber(){
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        number = Math.abs(number);

        if(number == 0){
            System.out.println("вы передали 1 число");
        }
        else {
            do {
                number = number / 10;
                count++;
            } while (number > 0);

            System.out.println("Вы передали " + count + " числа");
        }

        return count;
    }

    static void main(String[] args) {
        CountNumber countNumber = new CountNumber();
        countNumber.countNumber();
    }
}
