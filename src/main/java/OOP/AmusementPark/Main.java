package OOP.AmusementPark;

public class Main {
    static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        AmusementPark amusementPark = new AmusementPark();

        amusementPark.operateAttraction(rollerCoaster);
        amusementPark.operateAttraction(carousel);
    }
}
