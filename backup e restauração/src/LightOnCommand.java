import java.io.BufferedReader;
import java.io.PrintWriter;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void store(PrintWriter writer) {
        writer.println("LightOnCommand:" + light.getLocation());
    }

    @Override
    public void load(BufferedReader reader) {
    }
}
