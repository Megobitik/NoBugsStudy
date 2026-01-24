package OOP.Zoo;

public class Bird extends Animal{

    public Bird(){
        super("чирикает","на крыльях","птичка");
    }
    @Override
    public void makeSound() {
        System.out.print(getSound());
    }

    @Override
    public void move() {
        System.out.print(getMove());
    }
}
