package OOP.Ferm;

public class Cow extends FarmAnimal{
    public Cow(){
        super("Корова","выпас","есть траву","даёт молоко");
    }

    @Override
    public void feed(){
        System.out.println(getFood());
    }

    @Override
    public void care(){
        System.out.println(getCare());
    }

    @Override
    public void produce(){
        System.out.println(getProduce());
    }
}
