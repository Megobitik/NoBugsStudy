package ConditionalAndLoops.DoWhile;

import java.util.Scanner;

public class CheckPass {
    Scanner scanner = new Scanner(System.in);
    String pass;

    public void checkPass(){
        do {
            System.out.println("Введите пароль:");
            pass = scanner.nextLine();

            if(pass.equals("pass")){
                System.out.println("пароль верный");
                break;
            }
        }while (!pass.equals("pass"));
    }

    static void main(String[] args) {
        CheckPass checkPass = new CheckPass();
        checkPass.checkPass();
    }
}
