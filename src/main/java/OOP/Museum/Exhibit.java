package OOP.Museum;

public class Exhibit implements MusumInterface {
    private String exhibit;

    public String getExhibit(){
        return this.exhibit;
    }
    public void setExhibit(String exhibit){
        this.exhibit = exhibit;
     }

    @Override
    public void describe() {

    }

    @Override
    public void preserve() {

    }
}
