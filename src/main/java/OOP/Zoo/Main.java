package OOP.Zoo;

public class Main {
    public static void main(String[] args){
        Animal elephant = new Elephant();
        Animal bird = new Bird();
        Zoo zoo = new Zoo();

        zoo.setAnimal(elephant);
        zoo.showAnimalBehavior(elephant);

        zoo.setAnimal(bird);
        zoo.showAnimalBehavior(bird);
    }
}
