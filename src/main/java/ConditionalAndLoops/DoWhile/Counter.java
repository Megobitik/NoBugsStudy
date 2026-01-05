package ConditionalAndLoops.DoWhile;

public class Counter {
    int i = 1;

    public int counter(){
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
        return i;
    }

    static void main(String[] args) {
        Counter counter = new Counter();
        counter.counter();
    }
}
