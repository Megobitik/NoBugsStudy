package AccessModifier;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(int someMaxPlayer, String someGameName, int someCurrentPlayers){
        this.maxPlayers = someMaxPlayer;
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayer){
        maxPlayers = newMaxPlayer;
    }
    void addPLayer(){
        if (currentPlayers < maxPlayers){
            this.currentPlayers++;
        }
        else {
            System.out.println("превышен максимум");
        }
    }
    void printGameStatus(){
        System.out.println("gameName "+ gameName + " текуще кол-во "+ currentPlayers + " макс " + maxPlayers);
    }
}
