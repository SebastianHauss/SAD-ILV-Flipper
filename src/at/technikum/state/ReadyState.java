package at.technikum.state;

import at.technikum.Flipper;

public class ReadyState extends State {

    public ReadyState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        flipper.decrementCredit();
        flipper.transitionToPlaying();
    }

    @Override
    public void flipLeft() {
        System.out.println("Spiel noch nicht gestartet!");
    }

    @Override
    public void flipRight() {
        System.out.println("Spiel noch nicht gestartet!");
    }

    @Override
    public void insertCoin() {
        flipper.incrementCredit();
        System.out.println("Kredit erhöht auf: " + flipper.getCredits());
    }
}
