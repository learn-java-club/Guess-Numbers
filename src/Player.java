public class Player {

    public String playername;
    public int playerguess;
    public int guesses;


    public  Player(String name){
        playername = name;
    }

    public void setPlayerguess(int input){
        playerguess = input;
        guesses = guesses+1;
    }
}
