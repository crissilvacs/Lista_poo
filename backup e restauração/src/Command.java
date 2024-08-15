import java.io.PrintWriter;
import java.io.BufferedReader;

public interface Command {
    void execute();
    void store(PrintWriter writer);
    void load(BufferedReader reader);
}
