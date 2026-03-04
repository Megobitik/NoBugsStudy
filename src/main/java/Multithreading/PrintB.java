package Multithreading;

public class PrintB implements Runnable{

    @Override
    public void run() {
        System.out.println("B");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("B");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("B");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("B");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("B");
    }
}
