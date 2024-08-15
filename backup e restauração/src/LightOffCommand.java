import java.io.BufferedReader;
import java.io.PrintWriter;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void store(PrintWriter writer) {
        writer.println("LightOffCommand:" + light.getLocation());
    }

    @Override
    public void load(BufferedReader reader) {
    }
}
