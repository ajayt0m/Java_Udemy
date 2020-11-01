package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000)
        {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        else if (score < 1000)
        {
            System.out.println("Your score is less than 1000");
        }
        else
        {
            System.out.println("Got here");
        }

        if (gameOver)
        {
            int finalscore = score + (levelCompleted * bonus);
            // the scope of final score is within if only. so it cant be used outside the if code block
            System.out.println("Your final score was " + finalscore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver)
        {
            int finalscore =  score + (levelCompleted * bonus);
            System.out.println("Your Second Final Score = " + finalscore);
        }

    }
}
