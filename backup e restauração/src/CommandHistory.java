// CommandHistory.java
import java.io.*;
import java.util.List;
// Classe para salvar e carregar o histórico de comandos
public class CommandHistory {
    public static void saveHistory(List<Command> history, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(history);
        }
    }
    // Carrega o histórico de comandos de um arquivo
    @SuppressWarnings("unchecked")
    public static List<Command> loadHistory(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Command>) in.readObject();
        }
    }
    
    public static void executeHistory(List<Command> history) {
        for (Command command : history) {
            command.execute();
        }
    }
}
