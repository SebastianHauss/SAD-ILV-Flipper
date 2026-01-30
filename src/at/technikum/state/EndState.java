package at.technikum.state;

import at.technikum.Flipper;

import java.util.Scanner;

public class EndState extends State {

    public EndState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("=== BONUS SPIEL ===");
        System.out.println("Rate eine Zahl zwischen 1 und 3:");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        int random = (int) (Math.random() * 3) + 1;
        if (guess == random) {
            System.out.println("Gewonnen! +1 Kredit");
            flipper.incrementCredit();
        } else {
            System.out.println("Verloren! Die Zahl war: " + random);
        }

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
