package at.technikum.state;

import at.technikum.Flipper;
import at.technikum.ScoreBoard;
import at.technikum.command.GuessNumberCommand;

import java.util.Scanner;

public class EndState extends State {

    public EndState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("\n=== BONUS SPIEL ===\n");

        Scanner scanner = new Scanner(System.in);

        GuessNumberCommand guessCommand = new GuessNumberCommand(scanner);
        guessCommand.execute();

        if (guessCommand.hasWon()) {
            flipper.incrementCredit();
            System.out.println("+1 Kredit! Gesamt: " + flipper.getCredits());
        }

        // Spiel vorbei → ScoreBoard resetten
        ScoreBoard.getInstance().reset();

        if (flipper.getCredits() > 0) {
            flipper.transitionToReady();
        } else {
            flipper.transitionToNoCredit();
        }
    }

    @Override
    public void flipLeft() {

    }

    @Override
    public void flipRight() {

    }

    @Override
    public void insertCoin() {
        flipper.incrementCredit();
        System.out.println("Kredit erhöht auf: " + flipper.getCredits());
    }
}
