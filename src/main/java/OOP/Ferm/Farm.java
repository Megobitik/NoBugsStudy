package OOP.Ferm;

public class Farm {

    public void setAnimal(FarmAnimal farmAnimal){
        System.out.println(farmAnimal.getAnimal());
    }

    public void serviceAnimal(FarmAnimal farmAnimal){
        farmAnimal.feed();
        farmAnimal.care();
        farmAnimal.produce();
    }
}
