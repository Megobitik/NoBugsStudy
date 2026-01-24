package OOP.Aquarium;

public class StarFish extends SeaCreature{
    public StarFish(){
        super("звездочка", "ползет");
    }

    @Override
    public void move(){
        System.out.println(getAnimal() + " медленно " + getMove() + " по дну");
    }
}
