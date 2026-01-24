package OOP.AmusementPark;

public class Main {
    static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        AmusementPark amusementPark = new AmusementPark();

        amusementPark.setAttraction(rollerCoaster);
        amusementPark.operateAttraction(rollerCoaster);

        amusementPark.setAttraction(carousel);
        amusementPark.operateAttraction(carousel);

    }
}
