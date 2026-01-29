package OOP.Aquarium;

public class Starfish extends SeaCreature{
    public Starfish(){
        super("звездочка", "ползет");
    }

    @Override
    public void move(){
        System.out.println(getAnimal() + " медленно " + getMove() + " по дну");
    }
}
