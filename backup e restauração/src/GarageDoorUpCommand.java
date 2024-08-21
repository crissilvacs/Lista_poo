import java.util.List;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;
    private List<Command> history;

    public GarageDoorUpCommand(GarageDoor garageDoor, List<Command> history) {
        this.garageDoor = garageDoor;
        this.history = history;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
