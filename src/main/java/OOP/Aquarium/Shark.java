package OOP.Aquarium;

public class Shark extends SeaCreature{

    public Shark(){
        super("акула","плывет");
    }

    @Override
    public void move(){
        System.out.println(getAnimal() + " " + getMove() + " Быстро и агрессивно");
    }
}
