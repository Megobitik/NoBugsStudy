package Multithreading;

public class PrintA implements Runnable{

    @Override
    public void run() {
        System.out.println("A");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("A");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("A");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("A");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("A");
    }
}

