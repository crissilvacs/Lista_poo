import java.util.List;

public class SoundOffCommand implements Command {
    private Sound sound;
    private List<Command> history;

    public SoundOffCommand(Sound sound, List<Command> history) {
        this.sound = sound;
        this.history = history;
    }

    @Override
    public void execute() {
        sound.off();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
