package ConditionalAndLoops.Switch;

import java.util.Scanner;

public class PriceTicket {
    static Scanner scanner = new Scanner(System.in);
    static int day = scanner.nextInt();

    public static int priceTicket(){
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("300 рублёв");
                break;
            case 6:
            case 7:
                System.out.println("450 рублёв");
                break;
            default:
                System.out.println("нет такого дня");
        }
        return day;
    }

    static void main() {
        PriceTicket.priceTicket();
    }
}
