package Lambda.FuncInterface;

public class MainForMath {
    static void main(String[] args) {
        MathOperation add = (a,b) -> a + b;
        MathOperation subtrack = (a,b)-> a - b;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation divide = (a,b) -> a / b;

        System.out.println(add.operate(3,3));
        System.out.println(subtrack.operate(3,3));
        System.out.println(multiply.operate(3,3));
        System.out.println(divide.operate(3,3));
    }
}
