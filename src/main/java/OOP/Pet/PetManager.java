package OOP.Pet;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet){
        this.pet = pet;
    }
    public void handlePet(Pet pet){
        pet.feed();
        pet.interact();
    }
}
