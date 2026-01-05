package ConditionalAndLoops.IfElse;

import java.util.Scanner;

public class CheckDiscount {
    static Scanner scanner =  new Scanner(System.in);
    static int age = scanner.nextInt();

    public static int checkDiscount(){
        if (age <= 18 && age != 0){
            System.out.println("Ваша скидка 25%");
        }
        else if(65 <= age){
            System.out.println("Ваша скидка 30%");
        }
        else {
            System.out.println("без скидки");
        }
        return age;
    }

    static void main() {
        CheckDiscount.checkDiscount();
    }
}
