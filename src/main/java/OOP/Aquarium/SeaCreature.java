package OOP.Aquarium;

public class SeaCreature implements Move{

    private String move;
    private String animal;

    public SeaCreature(String animal, String move){
        this.animal = animal;
        this.move = move;
    }

    public String getAnimal(){
        return this.animal;
    }

    public String getMove(){
        return this.move;
    }

    @Override
    public void move() {
    }
}
