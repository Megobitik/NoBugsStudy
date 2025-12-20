package Objects;

public class Laptop {
    String brand;
    int price;

    Laptop(String anyBrand,int anyPrice){
        this.brand = anyBrand;
        this.price = anyPrice;
    }

    String getBrand(){
        return this.brand;
    }
    int getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }
    public void printInfo(){
        System.out.println("Brand= "+ brand + " price= "+price);
    }
}
