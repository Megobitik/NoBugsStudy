package OOP.Zoo;

public class Zoo {
    public void setAnimal(Animal animal){
        animal.getAnimal();
    }
    public void showAnimalBehavior(Animal animal){
        System.out.print(animal.getAnimal() + " двигается: ");
        animal.move();
        System.out.print(" и издает звук: ");
        animal.makeSound();
    }
}
