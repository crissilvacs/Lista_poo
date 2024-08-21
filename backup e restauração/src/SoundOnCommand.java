import java.util.List;

public class SoundOnCommand implements Command {
    private Sound sound;
    private List<Command> history;

    public SoundOnCommand(Sound sound, List<Command> history) {
        this.sound = sound;
        this.history = history;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
