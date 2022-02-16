package com.company;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
	//
    // Use a while loop to run through choices
    // Set up Scanner for user turn
        //compare user move to opponent move
        //Create class called check winner (scoreboard option?)
        //generate computer
        //Step 2 is to error proof our inputs
        Opponent computer = new Opponent();
        //call opponent move with variable named ComputerPlay
        String computerPlay = computer.getOpponentMove();
        int isWinner;
        String userPlay = "XX";

        Scanner userInput = new Scanner(System.in);

        while (userPlay.equals("Rock") == false || (userPlay.equals("Paper")) == false || (userPlay.equals("Scissors"))
        == false) {

            System.out.println("Pick a move: Rock, Paper, or Scissors");
            userPlay = userInput.next();
        }

        //print computer move
        System.out.println("Computer chose " + computerPlay);
        //declare results
        isWinner = computer.didUserWin(userPlay, computerPlay);
        computer.scoreBoard(isWinner);
    }
}
