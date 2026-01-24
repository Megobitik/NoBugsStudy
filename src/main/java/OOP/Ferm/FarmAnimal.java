package OOP.Ferm;

public abstract class FarmAnimal {
    private String animal;
    private String care;
    private String food;
    private String produce;

    public FarmAnimal(String animal, String care, String food, String produce){
        this.animal = animal;
        this.care = care;
        this.food = food;
        this.produce = produce;
    }

    public String getAnimal(){
        return this.animal;
    }

    public String getFood() {
        return food;
    }

    public String getCare() {
        return care;
    }

    public String getProduce(){
        return this.produce;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }

    abstract void feed();
    abstract void care();
    abstract void produce();
}
