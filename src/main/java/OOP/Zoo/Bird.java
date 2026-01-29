package OOP.Zoo;

public class Bird extends Animal{

    public Bird(){
        super("чирикает","на крыльях","птичка");
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
