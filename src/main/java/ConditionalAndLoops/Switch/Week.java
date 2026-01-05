package ConditionalAndLoops.Switch;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Week {

    static Scanner scanner =  new Scanner(System.in);
    static int day = scanner.nextInt();

    public static int dayOfWeek() {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Некорректное значение");
                break;
        }
        return day;
    }

    static void main(String[] args){
        Week.dayOfWeek();
    }
}
