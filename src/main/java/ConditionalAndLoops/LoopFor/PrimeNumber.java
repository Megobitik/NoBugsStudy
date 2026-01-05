package ConditionalAndLoops.LoopFor;

import java.util.Scanner;

public class PrimeNumber {

    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();
    static boolean isPrime = true;

    static public int checkIsPrime() {
        if (number == 1) {
            isPrime = false;
        }
        for (int i = 2; number > i; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == false){
            System.out.println(number + ": не простое");
        }
        else {
            System.out.println(number + ": число простое");
        }
        return number;
    }


    static void main(String[] args) {
        PrimeNumber.checkIsPrime();
    }
}
