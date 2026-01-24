package OOP.BotanicalGarden;

public class BotanicalGarden {
    public void setPlant(Plant plant){
        System.out.println(plant.getPlant());
    }

    public void maintainPlant(Plant plant){
        plant.care();
    }
}
