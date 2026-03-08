package Multithreading;

public class PrintB implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("B");
            try {
                Thread.sleep((500));
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
