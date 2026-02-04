package at.technikum;

public class ScoreBoard {

    private static ScoreBoard instance;
    private int score;

    private ScoreBoard() {
        this.score = 0;
    }

    public static ScoreBoard getInstance() {
        if (instance == null) {
            instance = new ScoreBoard();
        }
        return instance;
    }

    public void addPoints(int points) {
        score += points;
    }

    public void removePoints(int points) {
        score -= points;
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        score = 0;
    }
}
