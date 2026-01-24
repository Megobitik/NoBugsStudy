package OOP.AmusementPark;

public class RollerCoaster extends Attraction{

    @Override
    void info() {
        setAttraction("Американские горки");
        System.out.println(getAttraction() + " доступны");
    }

    @Override
    void maintain() {
        setAttraction("Американских горок");
        System.out.println("Для " + getAttraction() + " делают проверку безопасности");
    }
}
