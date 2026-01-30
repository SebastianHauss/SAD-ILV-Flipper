public class CreditState extends State {

    protected CreditState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("Changing into Playing State!");
    }

    @Override
    public void flipLeft() {

    }

    @Override
    public void flipRight() {

    }
}
