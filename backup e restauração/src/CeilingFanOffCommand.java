import java.util.List;

public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;
    private List<Command> history;

    public CeilingFanOffCommand(CeilingFan ceilingFan, List<Command> history) {
        this.ceilingFan = ceilingFan;
        this.history = history;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
