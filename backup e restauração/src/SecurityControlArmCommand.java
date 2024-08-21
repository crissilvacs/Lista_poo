import java.util.List;

public class SecurityControlArmCommand implements Command {
    private SecurityControl securityControl;
    private List<Command> history;

    public SecurityControlArmCommand(SecurityControl securityControl, List<Command> history) {
        this.securityControl = securityControl;
        this.history = history;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void store() {
        history.add(this);
    }
}
