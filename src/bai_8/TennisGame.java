package bai_8;

public class TennisGame {
    private static final String[] SCORES = {"Love", "Fifteen", "Thirty", "Forty"};

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (isScoreEqual(player1Score, player2Score)) {
            return equalScore(player1Score);
        }

        if (isReadyToWin(player1Score, player2Score)) {
            return getWinningScore(player1Score, player2Score);
        }

        return getRegularScore(player1Score, player2Score);
    }

    private static boolean isScoreEqual(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    private static String equalScore(int playerScore) {
        if (playerScore < SCORES.length) {
            return SCORES[playerScore] + "-All";
        }

        return "Deuce";
    }

    private static boolean isReadyToWin(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private static String getWinningScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == 1) {
            return "Advantage player1";
        }

        if (scoreDifference == -1) {
            return "Advantage player2";
        }

        if (scoreDifference >= 2) {
            return "Win for player1";
        }

        return "Win for player2";
    }

    private static String getRegularScore(int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();

        for (int i = 1; i < 3; i++) {
            int tempScore = (i == 1) ? player1Score : player2Score;

            if (i > 1) {
                score.append("-");
            }

            score.append(SCORES[tempScore]);
        }

        return score.toString();
    }

}
