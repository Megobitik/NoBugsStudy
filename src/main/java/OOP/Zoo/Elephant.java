package OOP.Zoo;

public class Elephant extends Animal{

    public Elephant(){
        super("трубить","ногами","Слон");
    }
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }

    @Override
    public void move() {
        System.out.print(getMove());
    }
}
