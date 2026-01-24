package OOP.Pet;

public abstract class Pet {
    private String food;
    private String action;
    private String pet;

    public Pet(String food, String action, String pet){
        this.food = food;
        this.action = action;
        this.pet = pet;
    }

    public String getFood() {
        return food;
    }

    public String getAction() {
        return action;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    abstract void feed();
    abstract void interact();
}
