package OOP.Pet;

public class Cat extends Pet{
    public Cat(){
        super("влажный корм","играет","кошка");
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
