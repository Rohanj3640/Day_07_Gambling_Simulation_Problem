package com.bridgelabs;

public class GamblingProblem {
    //UC1 TAKING STAKE AS 100 AND BET AS 1

    public static final int STAKE = 100;
    public static final int BET = 1;

    //UC2 CHECK WIN OR LOSS

    public void makeBet() {

        int win = 1;
        int random = (int) (Math.random() * 2);

        if (random == win) {
            System.out.println("WON");
        } else {
            System.out.println("LOSE");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Gambling Simulation Problem");

        GamblingProblem game = new GamblingProblem();
        game.makeBet();
    }
}
