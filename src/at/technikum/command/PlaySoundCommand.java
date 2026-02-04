package at.technikum.command;

public class PlaySoundCommand implements Command {
    private String soundFile;

    public PlaySoundCommand(String soundFile) {
        this.soundFile = soundFile;
    }

    @Override
    public void execute() {
        System.out.println("Spiele Sound: " + soundFile);
        // AudioPlayer.play(soundFile);
    }

    @Override
    public void undo() {
        // kann nicht rückgängig gemacht werden
    }
}
