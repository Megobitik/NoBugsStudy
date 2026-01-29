package OOP.Zoo;

public class Elephant extends Animal{

    public Elephant(){
        super("трубить","ногами","слон");
    }
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    @Override
    public void move() {
        System.out.println(getMove());
    }
}
