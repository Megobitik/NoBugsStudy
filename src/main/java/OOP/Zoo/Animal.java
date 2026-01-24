package OOP.Zoo;

public abstract class Animal {
    private String sound;
    private String move;
    private String animal;

    public Animal(String sound, String move, String animal){
        this.sound = sound;
        this.move = move;
        this.animal = animal;
    }

    public String getMove() {
        return move;
    }

    public String getAnimal() {
        return animal;
    }

    public String getSound() {
        return sound;
    }

    public abstract void makeSound();
    public abstract void move();
}
