package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class CheckResultByPoint {
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();

    public static int checkResultByPoint(){
        if (number >= 90){
            System.out.println("Отлично");
        }
        else if(75 <= number && number <= 89 ){
            System.out.println("Хорошо");
        }
        else if(60 <= number && number <= 74){
            System.out.println("Удовлетворительно");
        }
        else if (number < 60){
            System.out.println("Неудовлетворительно");
        }
        return number;
    }

    static void main() {
        CheckResultByPoint.checkResultByPoint();
    }
}
