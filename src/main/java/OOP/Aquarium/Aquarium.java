package OOP.Aquarium;

public class Aquarium {

    private SeaCreature seaCreature;

    public void setCreature(SeaCreature seaCreature){
        this.seaCreature = seaCreature;
    }
    public void showMovement(SeaCreature seaCreature){
        seaCreature.move();
    }
}
