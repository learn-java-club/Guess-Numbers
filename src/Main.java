/*
 * Play.java
 *
 * Created on 23. April 2019
 *
 * Copyright(c) {2019} Ulrich Rosenbaum  All Rights Reserved.
 * This software is the proprietary information of Ulrich Rosenbaum.
 *
 */
import java.util.Random;
import java.util.Scanner;
//import java.nio;
public class Main {

    public static void main(String[] args) {
        System.out.println("Guess the number!");
        Random rand = new Random();

        String newGame = "Y";
        if (newGame == "Y") {
            do {

                int guess = rand.nextInt(100);
                guess += 1;

                int playersguess = 0;

                Scanner input = new Scanner(System.in);
                System.out.println("\nPlease enter your name: ");

                Player player = new Player(input.nextLine());
                System.out.println(String.format(GameInstructions.welcomeMsg, player.playername));


                do {
                    System.out.println("\nEnter your guess: ");
                    String userInput = input.next();
                    if (Util.isInteger(userInput, player) > 0) {
                        playersguess = player.playerguess;


                        if (playersguess <= 0 || playersguess > 100) {
                            System.out.println(GameInstructions.valueOutOfRange);
                            player.playerguess--;
                        } else if (playersguess < guess ) {
                            System.out.println(GameInstructions.valueTooSmall);

                        } else if (playersguess > guess )
                            System.out.println(GameInstructions.valueTooBig);
                    }
                    else {
                        System.out.println(GameInstructions.notNumber);
                    }
                }
                while (playersguess != guess);
                System.out.println(String.format(GameInstructions.winningMsg, player.playername, player.guesses));


                Scanner inputPlayAgain = new Scanner(System.in);
                System.out.println(GameInstructions.askForRematch);
                newGame = inputPlayAgain.nextLine();

                System.out.println("\nYou entered: " + newGame);


            } while (newGame.equals("Y"));
        }
    }
}