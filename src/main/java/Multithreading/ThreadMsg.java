package Multithreading;

public class ThreadMsg extends Thread {
    public void run(){
        try {
            printMsg();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void printMsg() throws InterruptedException {
        System.out.println("Привет из потока");
        Thread.sleep(1000);
        System.out.println("Привет из потока");
        Thread.sleep(1000);
        System.out.println("Привет из потока");
        Thread.sleep(1000);
        System.out.println("Привет из потока");
        Thread.sleep(1000);
        System.out.println("Привет из потока");

    }

    static void main(String[] args) {
        ThreadMsg threadMsg = new ThreadMsg();
        threadMsg.start();
    }
}
