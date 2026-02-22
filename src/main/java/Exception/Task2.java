package Exception;

public class Task2 {
    static void main(String[] args) {
        int a = 5,b;

        try {
            b = a / 0;
            System.out.println(b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
