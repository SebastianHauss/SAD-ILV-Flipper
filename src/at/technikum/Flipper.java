package at.technikum;

import at.technikum.command.*;
import at.technikum.state.*;

public class Flipper {
    private State state;
    private int credits;
    private int ballsLost;
    private static final int MAX_BALLS = 3;

    Flipper() {
        this.state = new NoCreditState(this);
        this.credits = 0;
        this.ballsLost = 0;
    }

    public void transitionToReady() {
        System.out.println("Wechsle in den Ready-Zustand!");
        this.state = new ReadyState(this);
    }

    public void transitionToPlaying() {
        System.out.println("Wechsle in den Playing-Zustand!");
        this.state = new PlayingState(this);
    }

    public void transitionToNoCredit() {
        System.out.println("Wechsle in den NoCredit-Zustand!");
        this.state = new NoCreditState(this);
    }

    public void transitionToEndState() {
        System.out.println("Wechsle in den EndState!");
        this.state = new EndState(this);
    }

    public void pressStart() {
        state.pressStart();
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void flipLeft() {
        state.flipLeft();
    }

    public void flipRight() {
        state.flipRight();
    }

    public void incrementCredit() {
        credits++;
    }

    public void decrementCredit() {
        credits--;
    }

    public int getCredits() {
        return this.credits;
    }

    public void loseBall() {
        ballsLost++;
        System.out.println("Kugel verloren! (" + ballsLost + "/" + MAX_BALLS + ")");

        if (ballsLost >= MAX_BALLS) {
            transitionToEndState();
        }
    }

    public void resetBalls() {
        ballsLost = 0;
    }

    public int getBallsLost() {
        return ballsLost;
    }
}
