package OOP.Museum;

public class Sculpture extends Exhibit{

    @Override
    public void describe() {
        setExhibit("Скульптура");
        System.out.println(getExhibit() + " это скульптурный объект");
    }

    @Override
    public void preserve() {
        setExhibit("Скульптуре");
        System.out.println(getExhibit() + " требуется рестоврация");
    }
}
