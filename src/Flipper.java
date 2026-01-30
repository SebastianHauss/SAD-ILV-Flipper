public class Flipper {

    private State state;
    private int credits;

    Flipper() {
        this.state = new NoCreditState(this);
    }

    public static void main(String[] args) {
        Flipper flipper = new Flipper();
        flipper.play();
    }

    public void play() {
        state.pressStart();
        state.insertCoin();
        state.pressStart();
        state.flipLeft();
        state.flipRight();
    }

    public void incrementCredit() {
        credits++;
    }

    public void decrementCredit() {
        credits--;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCredits() {
        return this.credits;
    }
}
