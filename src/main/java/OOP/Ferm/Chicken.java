package OOP.Ferm;

public class Chicken extends FarmAnimal{
    public Chicken(){
        super("Курица","кормушка","есть зерно","несет яйца");
    }

    @Override
    public void feed(){
        System.out.println("ест " + getFood());
    }

    @Override
    public void care(){
        System.out.println("для уходжа нужен " + getCare());
    }

    @Override
    public void produce(){
        System.out.println(getProduce());
    }
}
