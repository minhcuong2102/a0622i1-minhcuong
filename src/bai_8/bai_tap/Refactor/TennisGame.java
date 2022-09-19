package bai_8.bai_tap.Refactor;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isDraw = player1Score == player2Score;
        boolean isEnd = player1Score >= 4 || player2Score >= 4;
        if (isDraw) return getGameDrawCalledScore(player1Score);
        if (isEnd) return getGameEndCalledScore(player1Score, player2Score);

        return getPlayerCalledScore(player1Score) + "-" + getPlayerCalledScore(player2Score);
    }

    private static String getGameDrawCalledScore(int drawScore) {
        switch (drawScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getGameEndCalledScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player 1.";
        if (minusResult == -1) return "Advantage player 2.";
        if (minusResult >= 2) return "Win for player 1.";
        return "Win for player 2.";
    }

    private static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}