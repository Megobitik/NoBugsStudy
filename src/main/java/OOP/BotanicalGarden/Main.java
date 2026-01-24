package OOP.BotanicalGarden;

public class Main {
    static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        botanicalGarden.setPlant(orchid);
        botanicalGarden.maintainPlant(orchid);

        botanicalGarden.setPlant(cactus);
        botanicalGarden.maintainPlant(cactus);
    }
}
