import java.util.List;

public class TVOffCommand implements Command {
    private TV tv;
    private List<Command> history;

    public TVOffCommand(TV tv, List<Command> history) {
        this.tv = tv;
        this.history = history;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
