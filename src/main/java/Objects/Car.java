package Objects;

public class Car {
    String brand;
    int year;

    Car (String anyBrand,int anyYear){
        this.brand = anyBrand;
        this.year = anyYear;
    }

    String getBrand(){
        return this.brand;
    }
    int getYear(){
        return this.year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setYear(int newYear){
        this.year = newYear;
    }

    void print(){
        System.out.println("Марка машины " + brand  + " годы выпуска " + year);
    }

}
