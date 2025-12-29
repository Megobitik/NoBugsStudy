package AccessModifier;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers){
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayer){
        maxPlayers = newMaxPlayer;
    }
    void addPlayer(){
        if (currentPlayers < maxPlayers){
            this.currentPlayers++;
        }
        else {
            System.out.println("превышен максимум");
        }
    }
    void printGameStatus(){
        System.out.println("gameName "+ gameName + " текущее кол-во "+ currentPlayers + " макс " + maxPlayers);
    }
}
