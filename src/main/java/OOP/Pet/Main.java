package OOP.Pet;

public class Main {
    static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        PetManager petManager = new PetManager();

        petManager.setPet(cat);
        petManager.handlePet(cat);

        petManager.setPet(dog);
        petManager.handlePet(dog);
    }
}
