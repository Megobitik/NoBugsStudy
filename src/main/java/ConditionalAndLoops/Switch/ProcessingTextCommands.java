package ConditionalAndLoops.Switch;

import java.util.Scanner;

public class ProcessingTextCommands {

    static Scanner scanner = new Scanner(System.in);
    static String command = scanner.nextLine();

    public static String proceesing(){
        switch (command){
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Запрос состояния системы");
                break;
            default:
                System.out.println("Не распознаная комманда");
                break;
        }
        return command;
    }

    static void main() {
        ProcessingTextCommands.proceesing();
    }
}
