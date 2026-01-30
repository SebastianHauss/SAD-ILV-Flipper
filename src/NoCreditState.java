public class NoCreditState extends State {

    public NoCreditState(Flipper flipper) {
        super(flipper);
    }

    @Override
    public void pressStart() {
        System.out.println("Pls insert coin");
    }

    @Override
    public void flipLeft() {

    }

    @Override
    public void flipRight() {

    }

    @Override
    public void insertCoin() {
        super.insertCoin();
        System.out.println("Changing into Credit State!");
        getFlipper().setState(new ReadyState(getFlipper()));
    }
}
