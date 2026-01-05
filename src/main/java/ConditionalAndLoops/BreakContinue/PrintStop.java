package ConditionalAndLoops.BreakContinue;

import java.util.Scanner;

public class PrintStop {
    Scanner scanner = new Scanner(System.in);
    String input;
    public String printer(){
        while (true){
            System.out.print("введите команду на латинице: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            else {
                System.out.println(input);
            }
        }
        return input;
    }

    static void main(String[] args) {
        PrintStop printStop = new PrintStop();
        printStop.printer();
    }
}
