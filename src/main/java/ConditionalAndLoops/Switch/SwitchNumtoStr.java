package ConditionalAndLoops.Switch;

import java.util.Scanner;

public class SwitchNumtoStr {

    static Scanner scanner = new Scanner(System.in);
    static int num = scanner.nextInt();

    public static int changeIntToString(){
        if (90 <= num && num <= 100){
            System.out.println("A");
        }
        else if (80 <= num && num <= 89){
            System.out.println("B");
        }
        else if (70 <= num && num <= 79){
            System.out.println("C");
        }
        else if (60 <= num && num <= 69){
            System.out.println("D");
        }
        else if ( num < 60){
            System.out.println("F");
        }
        else {
            System.out.println("без оценки");
        }
        return num;
    }

    static void main() {
        SwitchNumtoStr.changeIntToString();
    }
}
