package Multithreading;

public class MainBA {
    public static void main(String[] args) {
        PrintA printA = new PrintA();
        PrintB printB = new PrintB();

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);

        t1.start();
        t2.start();
    }
}
