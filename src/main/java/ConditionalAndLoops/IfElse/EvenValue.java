package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class EvenValue {
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();

    static int checkEvenValue(){
        if(number != 0){
            if(number % 2 == 0){
                System.out.println(number + " Число четное");
            }
            else {
                System.out.println(number + " Число нечетное");
            }
        }
        else {
            System.out.println("На ноль не делим");
        }
        return number;
    }

    static void main() {
        EvenValue.checkEvenValue();
    }
}
