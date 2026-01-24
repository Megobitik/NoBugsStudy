package OOP.BotanicalGarden;

public abstract class Plant {
    private String plant;

    public Plant(String plant){
        this.plant = plant;
    }

    public String getPlant(){
        return this.plant;
    }

    abstract void care();
}
