package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class MaxAorB {
    Scanner scanner = new Scanner(System.in);
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();

    public void checkMaxNumber(){
        if (numberA > numberB){
            System.out.println(numberA + " Первое число больше");
        }
        else{
            System.out.println(numberB + " Второе число больше");
        }
    }

    static void main() {
        MaxAorB maxAorB = new MaxAorB();
        maxAorB.checkMaxNumber();
    }
}
