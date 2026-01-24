package OOP.Museum;

public class Manuscript extends Exhibit{

    @Override
    public void describe() {
        setExhibit("Манускрипт");
        System.out.println(getExhibit() + " это древний текст");
    }

    @Override
    public void preserve() {
        setExhibit("Манускрипту");
        System.out.println(getExhibit() + " требуется контролируемая влажность");
    }
}
