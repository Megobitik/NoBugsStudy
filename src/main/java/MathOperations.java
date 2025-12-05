public class MathOperations {
    // создаем main метод
    public static void main (String[] args){
        int resultSum = sum(3,2);
        System.out.println(resultSum);
        int resultSubtract = subtract(0, 2);
        System.out.println(resultSubtract);
        int resultMultiply = multiply(4,5);
        System.out.println(resultMultiply);
        double resultDivide = divide(3,0);
        System.out.println(resultDivide);
    }
    //add(int x, int y) — возвращает сумму двух чисел
    public static int sum(int x, int y){
        return x + y;
    }
    //subtract(int x, int y) — разницу
    public static int subtract(int x,int y){
        return x - y;
    }
    //multiply(int x, int y) — произведение
    public static int multiply(int x, int y){
        return x * y;
    }
    //divide(int x, int y) — результат деления в double
    public static double divide(int x,int y){
        if  (y == 0) {
            System.out.println("не делим на нуль");
            return 0.0;
        }
        else {
            return (double) x / y;
        }
    }
}
