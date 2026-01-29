package OOP.Restraunt;

public class Menu {
    private Dish dish;
    public void addDish(Dish dish){
        this.dish = dish;
    }
    public void printMenu(Dish dish){
        dish.getDescription();
    }
}
