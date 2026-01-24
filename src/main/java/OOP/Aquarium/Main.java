package OOP.Aquarium;

public class Main {
    static void main(String[] args) {
        SeaCreature shark = new Shark();
        SeaCreature starFish = new StarFish();
        Aquarium aquarium = new Aquarium();

        aquarium.setCreature(shark);
        aquarium.showMovement(shark);

        aquarium.setCreature(starFish);
        aquarium.showMovement(starFish);
    }
}
