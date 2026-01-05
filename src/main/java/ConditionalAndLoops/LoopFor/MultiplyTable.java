package ConditionalAndLoops.LoopFor;

import java.util.Scanner;

public class MultiplyTable {
    // Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.

    static Scanner scanner = new Scanner(System.in);
    static int num = scanner.nextInt();

    public static int multiply(){
        for(int i=1; i <= 10; i++){
            if (num != 0){
                int result = num * i;
                System.out.println(num + " * " + i + " = " + result);
            }
        }
        return num;
    }

    static void main() {
        MultiplyTable.multiply();
    }
}
