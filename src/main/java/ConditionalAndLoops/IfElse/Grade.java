package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class Grade {
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();

    static void checkGrade(){
        switch (number){
            case 1:
            case 2:
                System.out.println(number + " Неудовлетворительно");
                break;
            case 3:
                System.out.println(number + " Удовлетворительно");
                break;
            case 4:
                System.out.println(number + " Хорошо");
                break;
            case 5:
                System.out.println(number + " Отлично");
                break;
            default:
                System.out.println("Нет такой оценки");
        }
    }

    static void main() {
        Grade.checkGrade();
    }
}
