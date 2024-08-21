// HotTubJetsOnCommand.java
import java.util.List;

public class HotTubJetsOnCommand implements Command {
    private HotTub hotTub;
    private List<Command> history;

    public HotTubJetsOnCommand(HotTub hotTub, List<Command> history) {
        this.hotTub = hotTub;
        this.history = history;
    }

    @Override
    public void execute() {
        hotTub.jetsOn();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
