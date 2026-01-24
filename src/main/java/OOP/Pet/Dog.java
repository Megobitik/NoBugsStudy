package OOP.Pet;

public class Dog extends Pet{
    public Dog(){
        super("сухой корм", "гуляет", "собака");
    }

    @Override
    void feed() {
        System.out.println(getPet() + " кушает " + getFood());
    }

    @Override
    void interact() {
        System.out.println(getPet() + " на улице " + getAction());
    }
}
