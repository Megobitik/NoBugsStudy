package OOP.Zoo;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public void showAnimalBehavior(Animal animal){
        System.out.print(animal.getAnimal() + " двигается: ");
        animal.move();
        System.out.print(" и издает звук: ");
        animal.makeSound();
    }
}
