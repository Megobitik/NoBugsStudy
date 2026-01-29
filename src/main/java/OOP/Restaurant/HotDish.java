package OOP.Restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature){
        super("Горячее блюдо");
        this.temperature = temperature;
    }

    @Override
    void getDescription() {
        System.out.println("Ваше " + getDish() + " будет " + temperature + " ГРАДУСОВ.");
    }
}
