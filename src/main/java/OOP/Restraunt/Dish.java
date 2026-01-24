package OOP.Restraunt;

public abstract class Dish {
    private String dish;

    public Dish(String dish){
        this.dish = dish;
    }

    public String getDish(){
        return this.dish;
    }

    abstract void getDescription();
}
