package ConditionalAndLoops.Switch;

import java.util.Scanner;

public class Calculate {
    static Scanner scanner = new Scanner(System.in);
    static int operandA = scanner.nextInt();
    static String operator = scanner.next();
    static int operandB = scanner.nextInt();

    public static void calculate(){
        switch (operator){
            case "+":
                int sum = operandA + operandB;
                System.out.println(operandA + " + " + operandB + " = " + sum);
                break;
            case "-":
                int minus = operandA - operandB;
                System.out.println(operandA + " - " + operandB + " = " + minus);
                break;
            case "*":
                int multiply = operandA * operandB;
                System.out.println(operandA + " * " + operandB + " = " + multiply);
                break;
            case "/":
                if (operandB == 0){
                    System.out.println("Нельзя делить на ноль");
                }
                else {
                    int division = operandA / operandB;
                    System.out.println(operandA + " / " + operandB + " = " + division);
                }
                break;
        }
    }

    static void main() {
        Calculate.calculate();
    }
}
