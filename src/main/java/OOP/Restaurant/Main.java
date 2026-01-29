package OOP.Restaurant;

public class Main {
    static void main(String[] args) {
        Dish hotDish = new HotDish(40);
        Dish drink = new Drink(90);
        Menu menu = new Menu();

        menu.addDish(hotDish);
        menu.printMenu(hotDish);

        menu.addDish(drink);
        menu.printMenu(drink);
    }
}
