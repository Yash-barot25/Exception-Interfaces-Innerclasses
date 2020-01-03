package MethodChallenge;

public class CalculateHighScore {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("yash", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("sachin", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("sehwag", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("kohli", highScorePosition);


    }

    private static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");

    }

    private static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;

    }

}
