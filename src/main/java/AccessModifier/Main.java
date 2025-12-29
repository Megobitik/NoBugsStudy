package AccessModifier;

public class Main {
    public static void main(String[] agrs){
       Person alex = new Person("alex", "lag","123-45-6");
       Person kate = new Person("Kate","big","12354");
       alex.printPersonInfo();
       alex.setFirstName("Sha");
       alex.printPersonInfo();
       GameSettings.maxPlayers = 5;
    }
}
