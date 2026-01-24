package OOP.BotanicalGarden;

public class Cactus extends Plant{

    public Cactus(){
        super("Кактус");
    }

    @Override
    void care() {
        System.out.println("нужно свет и редкий полив");
    }
}
