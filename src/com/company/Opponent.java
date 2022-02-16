package com.company;

import java.util.Random;

public class Opponent {

    public Random rand = new Random();
    private String[] moves = {"Rock", "Paper", "Scissors"};
    private int win = 0;
    private int loss = 0;
    private int tie = 0;
    private int probRock = 1;
    private int probPaper = 1;
    private int probScissors = 1;


    public String getOpponentMove() { //set opponent move
        int prob;
        int total = probRock+probPaper+probScissors;
        prob = rand.nextInt(total);

        if( prob >=0 && prob < probRock){ // might be less than or equal through?
            return moves[0];
        }

        if(prob >= probRock && prob < probPaper){
            return moves[1];
        }
        return moves[2];
    }

    public int didUserWin(String user, String computer) {
        if (user.equals("Rock")) {
            probPaper = probPaper + 2;
            if (computer.equals("Scissors"))
                return 1;
            if (computer.equals("Paper"))
                return -1;
        }
        else if (user.equals("Scissors")) {
            probRock = probRock + 2;
            if (computer.equals("Rock"))
                return -1;
            if (computer.equals("Paper"))
                return 1;
        }
        else if (user.equals("Paper")) {
            probScissors = probScissors + 2;
                if (computer.equals("Rock"))
                    return 1;
                if (computer.equals("Scissors"))
                    return -1;
        }
        return 0;
        }

        public void scoreBoard(int x) { //declare scoreboard method
            if (x == 0) {
                System.out.println("You tied!");
                tie++;
            }
            else if (x == 1){
                System.out.println("You won!");
                win++;
            }
            else if (x == -1){
                System.out.println("You lost!");
                loss++;
            }
            System.out.println("You have "+win+" wins, "+loss+" losses, and "+tie+" ties");
            System.out.println("\n");
        }
    }
