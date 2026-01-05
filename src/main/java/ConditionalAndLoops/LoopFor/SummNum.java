package ConditionalAndLoops.LoopFor;

import java.util.Scanner;

public class SummNum {
    // Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n.
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();
    static int sum;

    public static int sumNum(){
        for(int i = 1; i <= number; i++){
            sum = sum + i;
            System.out.println((i-1) + " + " + i + " = " + sum);
        }
        return sum;
    }

    static void main() {
        SummNum.sumNum();
    }
}
