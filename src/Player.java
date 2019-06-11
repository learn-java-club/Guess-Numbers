public class Player {

    public String playerName;
    public int playerGuess;
    public int noOfAttempt;


    public  Player(String name){
        playerName = name;
    }

    public void setPlayerguess(int input){
        playerGuess = input;

        noOfAttempt = noOfAttempt+1;
    }
}
