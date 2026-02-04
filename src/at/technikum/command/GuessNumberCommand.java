package at.technikum.command;

import java.util.Scanner;

public class GuessNumberCommand implements Command {
    private final Scanner scanner;
    private final int correctNumber;
    private boolean won;

    public GuessNumberCommand(Scanner scanner) {
        this.scanner = scanner;
        this.correctNumber = (int) (Math.random() * 3) + 1;
        this.won = false;
    }

    @Override
    public void execute() {
        System.out.println("Rate eine Zahl (1-3):");
        System.out.print("> ");
        int guess = scanner.nextInt();

        if (guess == correctNumber) {
            System.out.println("RICHTIG! Bonus Punkte!");
            won = true;
        } else {
            System.out.println("FALSCH! Die Zahl war " + correctNumber);
            won = false;
        }
    }

    @Override
    public void undo() {
        // nicht rückgängig machbar
    }

    public boolean hasWon() {
        return won;
    }
}
