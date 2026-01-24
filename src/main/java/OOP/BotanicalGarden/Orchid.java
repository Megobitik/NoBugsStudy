package OOP.BotanicalGarden;

public class Orchid extends Plant{

    public Orchid(){
        super("Орхидея");
    }
    @Override
    void care() {
        System.out.println("нужно высокая влажность и тень");
    }
}
