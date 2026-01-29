package OOP.Restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume){
        super("Напиток");
        this.volume = volume;
    }

    @Override
    public void getDescription(){
        System.out.println("Ваш " + getDish() + " будет " + volume + "мл");
    }
}
