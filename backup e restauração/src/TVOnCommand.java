import java.util.List;

public class TVOnCommand implements Command {
    private TV tv;
    private List<Command> history;

    public TVOnCommand(TV tv, List<Command> history) {
        this.tv = tv;
        this.history = history;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void store() {
        history.add(this);
    }
}

