package Multithreading;

public class Volatile {
    private static volatile boolean stop;
    private static int count = 0;

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (!stop){
                count ++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(count);
            }
        });
        t1.start();
        Thread.sleep(2000);
        stop = true;
        System.out.println("Остановились");
    }
}
