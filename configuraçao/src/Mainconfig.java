public class Mainconfig {
    public static void main(String[] args) {
        // Acessar a instância única de ConfigManager
        ConfigManager configManager = ConfigManager.getInstance();

        // Imprimir todos os dados do arquivo de configuração
        configManager.printAllConfig();

        // filtrar
        String AppId = configManager.getConfigValue("AppId");
         System.out.println("AppId: " + AppId);
    }
}

