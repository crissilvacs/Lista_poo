import java.util.List;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;
    private List<Command> history;

    public GarageDoorDownCommand(GarageDoor garageDoor, List<Command> history) {
        this.garageDoor = garageDoor;
        this.history = history;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void store() {
        history.add(this);
    }
}

