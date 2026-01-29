package OOP.Museum;

public abstract class Exhibit {
    private String exhibit;

    public String getExhibit(){
        return this.exhibit;
    }
    public void setExhibit(String exhibit){
        this.exhibit = exhibit;
     }

    abstract void describe();
    abstract void preserve();
}
