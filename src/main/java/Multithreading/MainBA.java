package Multithreading;

public class MainBA {
    static void main(String[] args) {
        PrintA printA = new PrintA();
        PrintB printB = new PrintB();

        printB.run();
        printA.run();
    }
}
