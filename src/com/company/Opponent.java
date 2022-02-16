package com.company;

import java.util.Random;

public class Opponent {
    // create an opponent array or if loop
    // random int to generate opponent move

    public Random rand = new Random();
    private String[] moves = {"Rock", "Paper", "Scissors"};

    //set opponent move
    public String getOpponentMove() {
        //String response;
        int opponentMove = rand.nextInt(3);
        //response = intToString(opponentMove);
        return moves[opponentMove];

    }
    //create method to call int to string
    /*public String intToString(int i) {
        if (i == 0)
            return "Rock";
        else if (i == 1)
            return "Paper";
        else if (i == 2)
            return "Scissors";
        else
            return "Please enter another choice."; //attempt 1
        }*/

    //write method called compare that compares user choice to opponent move
    public int didUserWin(String user, String computer) {
        if (user.equals(computer))
            return 0;
        else if (user.equals("Rock")) {
            if (computer.equals("Scissors"))
                return 1;
            else if (computer.equals("Paper"))
                return -1;
        }
        else if (user.equals("Scissors")) {
                if (computer.equals("Rock"))
                    return -1;
                else if (computer.equals("Paper"))
                    return 1;
        }
        else if (user.equals("Paper")) {
                if (computer.equals("Rock"))
                    return 1;
                else if (computer.equals("Scissors"))
                    return -1;
        }
         {
                System.out.println("Error!");
                return 2;
            }
        }
        //declare scoreboard method
        public void scoreBoard(int x) {
            if (x == 0)
            System.out.println("You tied!");
            else if (x == 1)
            System.out.println("You won!");
            else if (x == -1)
            System.out.println("You lost!");
        }
    }
