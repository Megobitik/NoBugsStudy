package OOP.Farm;

public class Main {
    static void main(String[] args) {
        FarmAnimal cow = new Cow();
        FarmAnimal chicken = new Chicken();
        Farm farm = new Farm();

        farm.setAnimal(cow);
        farm.serviceAnimal(cow);

        farm.setAnimal(chicken);
        farm.serviceAnimal(chicken);
    }
}
