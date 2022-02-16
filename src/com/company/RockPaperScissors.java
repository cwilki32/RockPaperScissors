package com.company;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Opponent computer = new Opponent();
        String computerPlay;

        String userPlay = "XXX";
        int isWinner;
        boolean playAgain = true;


        System.out.print("Please Pick a move: Rock, Paper, or Scissors: ");
        userPlay = userInput.next();


        while(playAgain == true){
            while (userPlay.equals("Rock") == false && (userPlay.equals("Paper")) == false && (userPlay.equals("Scissors"))
                == false && userPlay.equals("Quit") == false) {
                System.out.print("Pick a move: Rock, Paper, or Scissors, or Quit: ");
                userPlay = userInput.next();

                if(userPlay.equals("Rock") == false && (userPlay.equals("Paper")) == false && (userPlay.equals("Scissors"))
                        == false && userPlay.equals("Quit") == false)
                    System.out.println("I dont recognize that answer");
            }

            if(userPlay.equals("Quit")){
                playAgain = false;
                break;
            }

            //computer move
            computerPlay = computer.getOpponentMove();
            System.out.print("Computer chose " + computerPlay+". ");

            //declare results
            isWinner = computer.didUserWin(userPlay, computerPlay);
            computer.scoreBoard(isWinner);

            userPlay = "XXX";

            }


        System.out.println("Final Score is:");
        computer.scoreBoard(2);
        System.out.println("Thank you for playing, have a great day!");



    }
}
