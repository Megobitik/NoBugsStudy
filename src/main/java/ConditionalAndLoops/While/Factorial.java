package ConditionalAndLoops.While;

import java.util.Scanner;

public class Factorial {

    static int result = 1;
    static int i = 1;

    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();

    public static int calculationactorial(){
        if (n == 0){
            System.out.println("должен быть 1");
        }
        if (n < 0){
            System.out.println("отрицательное число");
        }
        else {
            while (i <= n) {
                result *= i;
                i++;
                System.out.println(result);
            }
        }
        return n;
    }

    static void main(String[] args){
        Factorial.calculationactorial();
    }
}
