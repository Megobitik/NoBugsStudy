package Objects;

public class Circle {
    int radius;

    Circle (int anyRadius){
        this.radius = anyRadius;
    }

    int getRadius(){
        return this.radius;
    }
    void setRadius(int newRadius){
        this.radius = newRadius;
    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public void print(){
        System.out.println(calculateArea());
        System.out.println(calculateCircumference());
    }
}
