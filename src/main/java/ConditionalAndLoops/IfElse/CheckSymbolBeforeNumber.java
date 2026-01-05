package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class CheckSymbolBeforeNumber {

    Scanner scaner = new Scanner(System.in);
    int number = scaner.nextInt();

    public int checkNumber(){
        if (number > 0){
            System.out.println(number + " Число положительное");
        }
        else if (number < 0){
            System.out.println(number + "Число отрицательное");
        }
        else {
            System.out.println("Число равно нулю");
        }
        return number;
    }

    static void main() {
        CheckSymbolBeforeNumber checkSymbolBeforeNumber = new CheckSymbolBeforeNumber();
        checkSymbolBeforeNumber.checkNumber();
    }
}
