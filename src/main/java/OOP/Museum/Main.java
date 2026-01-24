package OOP.Museum;

public class Main {
    static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();

        museum.setExhibit(manuscript);
        museum.showExhibit(manuscript);

        museum.setExhibit(sculpture);
        museum.showExhibit(sculpture);
    }
}
