import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Singleton para gerenciar o arquivo de configuração
public class ConfigManager {
    private static ConfigManager instance;
    private Map<String, String> configData;

    // Construtor privado para impedir instanciamento direto
    private ConfigManager() {
        configData = new HashMap<>();
        loadConfigFile("config.txt");
    }

    // Método para obter a instância única do Singleton
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Método para carregar o arquivo de configuração
    private void loadConfigFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] keyValue = line.split("=", 2);
                if (keyValue.length == 2) {
                    configData.put(keyValue[0], keyValue[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para acessar os dados da configuração
    public String getConfigValue(String key) {
        return configData.get(key);
    }

    // Método para imprimir todos os dados da configuração
    public void printAllConfig() {
        configData.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
