package at.technikum.element;

import at.technikum.command.Command;

public abstract class FlipperElement {
    protected String name;
    protected Command hitCommand;

    public FlipperElement(String name) {
        this.name = name;
    }

    public void setHitCommand(Command command) {
        this.hitCommand = command;
    }

    public void hit() {
        System.out.println(name + " wurde getroffen!");
        if (hitCommand != null) {
            hitCommand.execute();
        }
    }
}
