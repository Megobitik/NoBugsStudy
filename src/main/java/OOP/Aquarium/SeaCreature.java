package OOP.Aquarium;

public abstract class SeaCreature {

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

    public abstract void move();
}
