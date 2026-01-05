package ConditionalAndLoops.LoopFor;

public class PrintNumbers {

    //Вывод чисел от 1 до 100, делящихся на 3
    static int i;
    public static int printNumbers(){
        for ( i =1;i<=100;i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
        return i;
    }

    static void main() {
        PrintNumbers.printNumbers();
    }
}
