public abstract class State {

    private Flipper flipper;

    protected State(Flipper flipper) {
        this.flipper = flipper;
    }

    public abstract void pressStart();

    public abstract void flipLeft();

    public abstract void flipRight();

    public void insertCoin() {
        this.flipper.incrementCredit();
    }

    protected Flipper getFlipper() {
        return this.flipper;
    }

    protected void setFlipperState(State state) {
        this.flipper.setState(state);
    }
}
