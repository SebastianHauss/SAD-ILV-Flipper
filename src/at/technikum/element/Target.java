package at.technikum.element;

public class Target extends FlipperElement {
    private boolean isDown = false;

    public Target(String name) {
        super(name);
    }

    @Override
    public void hit() {
        super.hit();
        isDown = true;
        System.out.println("Target " + name + " ist umgefallen!");
    }

    public void reset() {
        isDown = false;
        System.out.println("Target " + name + " ist wieder oben!");
    }
}