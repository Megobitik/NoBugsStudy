package Objects;

public class Point {
    int x;
    int y;

    Point (int anyX, int anyY){
        this.x = anyX;
        this.y = anyY;
    }

    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    void setX(int newX){
        this.x = newX;
    }
    public void print(){
        System.out.println("координаты x:"+x +" y:"+y);
    }
}
