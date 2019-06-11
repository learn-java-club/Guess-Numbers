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

        String newGame;

        do {

            int guess = rand.nextInt(101);


            int playerGuess = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("\nPlease enter your name: ");

            Player player = new Player(input.nextLine());
            System.out.println(String.format(GameInstructions.welcomeMsg, player.playerName));


            do {
                System.out.println("\nEnter your guess: ");
                String userInput = input.next();
                if (Util.getInterger(userInput, player) > 0) {

                    playerGuess = player.playerGuess;


                    if (playerGuess <= 0 || playerGuess > 100) {
                        System.out.println(GameInstructions.valueOutOfRange);
                        player.noOfAttempt--;
                    } else if (playerGuess < guess) {
                        System.out.println(GameInstructions.valueTooSmall);

                    } else if (playerGuess > guess)
                        System.out.println(GameInstructions.valueTooBig);
                } else {
                    System.out.println(GameInstructions.notNumber);
                }
            }
            while (playerGuess != guess);
            System.out.println(String.format(GameInstructions.winningMsg, player.playerName, player.noOfAttempt));


            Scanner inputPlayAgain = new Scanner(System.in);
            System.out.println(GameInstructions.askForRematch);

            newGame = inputPlayAgain.nextLine();
            System.out.println("\nYou entered: " + newGame);


        } while (newGame.equalsIgnoreCase("Y"));

    }
}