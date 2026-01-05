package ConditionalAndLoops.While;

import java.util.Scanner;

public class Сountdown {
    static int number = 1;
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();

    public static int countdown(){
        if (n > 0){
            while (number <= n) {
                System.out.println(n);
                n--;
            }
        }
        return number;
    }

    static void main(String[] args) {
        Сountdown.countdown();
    }
}
