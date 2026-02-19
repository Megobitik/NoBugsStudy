package Lambda.FuncInterface;

public class AnonimRun {
    static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Нужное сообщение");
            }
        };
        r.run();
    }
}
