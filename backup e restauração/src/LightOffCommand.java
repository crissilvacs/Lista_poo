import java.util.List;

public class LightOffCommand implements Command {
    private Light light;
    private List<Command> history;

    public LightOffCommand(Light light, List<Command> history) {
        this.light = light;
        this.history = history;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
