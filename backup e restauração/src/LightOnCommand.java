import java.util.List;

public class LightOnCommand implements Command {
    private Light light;
    private List<Command> history;

    public LightOnCommand(Light light, List<Command> history) {
        this.light = light;
        this.history = history;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
