package at.technikum.state;

import at.technikum.Flipper;

public class PlayingState extends State {

    public PlayingState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("Author: Sebastian Hauss");
    }

    @Override
    public void flipLeft() {
        System.out.println("Left Flipper!");
        // TODO: Hier später mit Command Pattern Elemente treffen
    }

    @Override
    public void flipRight() {
        System.out.println("Right Flipper!");
        // TODO: Hier später mit Command Pattern Elemente treffen
    }

    public void ballLost() {
        flipper.loseBall();
    }

    @Override
    public void insertCoin() {
        flipper.incrementCredit();
        System.out.println("Kredit erhöht auf: " + flipper.getCredits());
    }
}
