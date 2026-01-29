package OOP.BotanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant){
        this.plant = plant;
        System.out.println(plant.getPlant());
    }

    public void maintainPlant(Plant plant){
        plant.care();
    }
}
