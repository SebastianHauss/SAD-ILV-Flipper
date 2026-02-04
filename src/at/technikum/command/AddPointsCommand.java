package at.technikum.command;

import at.technikum.ScoreBoard;

public class AddPointsCommand implements Command {
    private int points;

    public AddPointsCommand(int points) {
        this.points = points;
    }

    @Override
    public void execute() {
        ScoreBoard.getInstance().addPoints(points);
        System.out.println("+" + points + " Punkte!");
    }

    @Override
    public void undo() {
        ScoreBoard.getInstance().removePoints(points);
    }
}
