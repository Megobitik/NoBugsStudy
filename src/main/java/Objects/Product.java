package Objects;

public class Product {
    String name;
    int price;

    Product(String anyName, int anyPrice){
        this.name = anyName;
        this.price = anyPrice;
    }

    String getName(){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }
    public void applyDiscount(int discount){
        price -= discount;
        System.out.println("discount = "+discount);
    }
    public void printInfo(){
        System.out.println("price = " +price);
    }
}

