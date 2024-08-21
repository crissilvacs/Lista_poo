import java.util.List;

public class HotTubJetsOffCommand implements Command {
    private HotTub hotTub;
    private List<Command> history;

    public HotTubJetsOffCommand(HotTub hotTub, List<Command> history) {
        this.hotTub = hotTub;
        this.history = history;
    }

    @Override
    public void execute() {
        hotTub.jetsOff();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
