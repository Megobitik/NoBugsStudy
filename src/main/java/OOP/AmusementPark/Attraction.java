package OOP.AmusementPark;

public abstract class Attraction {
    private String attraction;

    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    abstract void info();
    abstract void maintain();
}
