package OOP.AmusementPark;

public class AmusementPark {
    public void setAttraction(Attraction attraction){
        attraction.getAttraction();
    }
    public void operateAttraction(Attraction attraction){
        attraction.info();
        attraction.maintain();
    }
}
