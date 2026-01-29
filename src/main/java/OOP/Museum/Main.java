package OOP.Museum;

public class Main {
    static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();

        museum.showExhibit(manuscript);

        museum.showExhibit(sculpture);
    }
}
