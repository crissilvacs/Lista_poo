import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();
    private static final String FILE_NAME = "commands.txt";

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void storeCommands() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Command command : commandHistory) {
                command.store(writer);
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar os comandos: " + e.getMessage());
        }
    }

    public void loadCommands() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Nenhum comando anterior encontrado para carregar.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Command command = createCommandFromLine(line);
                commandHistory.add(command);
                command.execute();
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar os comandos: " + e.getMessage());
        }
    }

    private Command createCommandFromLine(String line) {
        String[] parts = line.split(":");
        String commandType = parts[0];
        String location = parts.length > 1 ? parts[1] : "";

        Light light = new Light(location);

        switch (commandType) {
            case "LightOnCommand":
                return new LightOnCommand(light);
            case "LightOffCommand":
                return new LightOffCommand(light);
            default:
                throw new IllegalArgumentException("Comando desconhecido: " + commandType);
        }
    }
}
