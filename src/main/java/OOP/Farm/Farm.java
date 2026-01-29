package OOP.Farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setAnimal(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
        System.out.println(farmAnimal.getAnimal());
    }

    public void serviceAnimal(FarmAnimal farmAnimal){
        farmAnimal.feed();
        farmAnimal.care();
        farmAnimal.produce();
    }
}
