// TEST file
public class Challenge {

    public static void main(String[] args) {

        String Name;
        int playerposition;

        Name = "Ajay";
        playerposition = calculateHighScorePosition(1500);
        displayHighScorePosition(Name, playerposition);

        Name = "Akshay";
        playerposition = calculateHighScorePosition(900);
        displayHighScorePosition(Name, playerposition);

        Name = "Abhay";
        playerposition = calculateHighScorePosition(400);
        displayHighScorePosition(Name, playerposition);

        Name = "Esha";
        playerposition = calculateHighScorePosition(50);
        displayHighScorePosition(Name, playerposition);

    }



    public static void displayHighScorePosition(String PlayerName, int position)
    {
        System.out.println(PlayerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500)
        {
            return  2;
        }
        else if (playerScore >= 100)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
}
