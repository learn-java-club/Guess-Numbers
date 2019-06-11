public class GameInstructions {

    public static String welcomeMsg = "\nDear %s have fun playing this game! " +
            "\nTry to guess the number between 1 and 100."
            + "\nThe goal is to use as few guesses as possible. Train your brain!\");";
    public static String winningMsg = "\nWell done %s! You guessed the secret number! Bravo!" +
            "\nYou needed %d guesses.";

    public static String askForRematch = "\nDo you want to play again? Y or N: ";
    public static String valueOutOfRange = "Invalid guess. Your guess must be between 1 and 100!";
    public static String valueTooSmall = "Your guess is too small!";
    public static String valueTooBig = "Your guess is too big!";
    public static String notNumber ="The value you entered is not a number!";
}
