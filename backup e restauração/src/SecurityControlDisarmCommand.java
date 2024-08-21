// SecurityControlDisarmCommand.java
import java.util.List;

public class SecurityControlDisarmCommand implements Command {
    private SecurityControl securityControl;
    private List<Command> history;

    public SecurityControlDisarmCommand(SecurityControl securityControl, List<Command> history) {
        this.securityControl = securityControl;
        this.history = history;
    }

    @Override
    public void execute() {
        securityControl.disarm();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
