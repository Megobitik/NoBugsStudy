package OOP.AmusementPark;

public class Carousel extends Attraction{
    @Override
    void info() {
        setAttraction("Карусель");
        System.out.println(getAttraction() + " доступна");
    }

    @Override
    void maintain() {
        setAttraction("Карусели");
        System.out.println("Для " + getAttraction() + " делают тех.обслуживание");
    }
}
