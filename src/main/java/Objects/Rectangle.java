package Objects;

public class Rectangle {
    int width;
    int height;

    Rectangle(int anyWidth, int anyHeight){
        this.width = anyWidth;
        this.height = anyHeight;
    }

    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return  this.height;
    }
    void setWidth(int newWidth){
        this.width = newWidth;
    }
    public int calculateArea(){
         return height * width;
    }
    void print(){
        System.out.println(calculateArea());
    }
}
