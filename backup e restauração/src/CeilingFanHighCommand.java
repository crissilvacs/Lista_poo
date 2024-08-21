import java.util.List;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private List<Command> history;

    public CeilingFanHighCommand(CeilingFan ceilingFan, List<Command> history) {
        this.ceilingFan = ceilingFan;
        this.history = history;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
