package ConditionalAndLoops.LoopFor;

public class OutputNumber {
    static int i;
    public static int outNumber(){
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
        return i;
    }

    static void main(String[] args) {
        OutputNumber.outNumber();
    }
}
